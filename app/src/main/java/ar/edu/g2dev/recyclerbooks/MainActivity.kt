package ar.edu.g2dev.recyclerbooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Genero un data class para almacenar LIBROS:
data class Libro(val titulo: String, val autor: String)

class MainActivity : AppCompatActivity() {
//El listOf ya no es de strings sino de LIBROS la data class que creamos antes
    private val listaVengadores = listOf("Iron Man", "Thor", "Bruja Escarlata", "Capitán Marvel", "Stark", "Hércules", "Falcon", "Wolverine")

    private val biblioteca = listOf(
        Libro("El amor en los tiempos del cólera", "Gabriel García Márquez"),
        Libro("Las cosas que perdimos en el fuego", "Mariana Enríquez"),
        Libro("Distancia de rescate", "Samanta Schweblin"),
        Libro("Ficciones", "Jorge Luis Borges"),
        Libro("El Aleph", "Jorge Luis Borges"),
        Libro("La náusea", "Jean-Paul Sartre"),
        Libro("Crónicas del Ángel Gris", "Alejandro Dolina"),
        Libro("El libro de los abrazos", "Eduardo Galeano")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //val vistaRecicladaLibros = findViewById<RecyclerView>(R.id.rvLibros)
        //val vistaRecicladaVengadores = findViewById<RecyclerView>(R.id.rvTarjetasVengadores)


        //Esto le indica al RecyclerView como debe organizar los elementos
        //En este caso, elementos en forma verticual (o depende la config que le di en el XML)
        //El cntext es el activity en donde esta parado
        //vistaRecicladaLibros.layoutManager = LinearLayoutManager(this)

        //vistaRecicladaVengadores.layoutManager = LinearLayoutManager(this)

        //Asignar un adapter para mostrar los datos
        //La lista de los vengadores y el contexto para el toast
        //Conectar (por eso se llama adapter) entre los datos y la vista
        //vistaRecicladaLibros.adapter = LibroAdapter(biblioteca, this)

        //vistaRecicladaVengadores.adapter = VengadoresAdapter(listaVengadores, this)


        //Se asigna un LayoutManager que organiza los items de manera vertical
        //Y el adapter: Crear las vistas(onCreateViewHolder), Rellena los datos (on onBindViewHolder)
        //Y al hacer click muestro el toast.

    }
}
