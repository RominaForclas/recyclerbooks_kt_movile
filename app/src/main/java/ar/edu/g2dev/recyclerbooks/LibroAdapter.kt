package ar.edu.g2dev.recyclerbooks

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView


// Adapter conecta la lista de Libros (data class) con el RecyclerView.
// Extiende RecyclerView.Adapter e indica que usará LibroViewHolder como ViewHolder.
class LibroAdapter(
    private val biblioteca: List<Libro>, // Lista de Libros.
    private val contexto: Context          // Contexto de la aplicación (necesario para inflar vistas y mostrar toasts).
) : RecyclerView.Adapter<LibroAdapter.LibroViewHolder>() {

    // Lista de colores para los fondos
    private val colores = listOf(
        ContextCompat.getColor(contexto, R.color.color1),
        ContextCompat.getColor(contexto, R.color.color2),
        ContextCompat.getColor(contexto, R.color.color3),
        ContextCompat.getColor(contexto, R.color.color4)
    )

    // ViewHolder contiene las referencias a los elementos de cada ítem.
    // Utiliza item_libro.xml como layout base.
    inner class LibroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNombreLibro: TextView = itemView.findViewById(R.id.tvTitulo)
        val tvAutor: TextView = itemView.findViewById(R.id.tvAutor)
    }

    // Infla el layout de cada ítem (item_vengador.xml) y crea un nuevo ViewHolder.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibroViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_libro, parent, false)
        return LibroViewHolder(vista)
    }

    // Asocia los datos del ítem en la posición indicada con el ViewHolder.
    // También configura el evento de clic para mostrar un mensaje.
    override fun onBindViewHolder(hold: LibroViewHolder, pos: Int) {
        val libro = biblioteca[pos]
        hold.tvNombreLibro.text = libro.titulo
        hold.tvAutor.text = libro.autor

        hold.itemView.setOnClickListener {
            Toast.makeText(contexto, "Seleccionaste: ${libro.titulo} de ${libro.autor}",Toast.LENGTH_LONG)
                .show()
        }
    }

    // Devuelve la cantidad total de ítems a mostrar.
    override fun getItemCount(): Int = biblioteca.size
}