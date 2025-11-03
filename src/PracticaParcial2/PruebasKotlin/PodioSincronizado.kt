package PracticaParcial2.PruebasKotlin

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class PodioSincronizado {

    private val llegadas = mutableListOf<String>()

    @Synchronized
    fun registrarLlegada(corredor: String): Int {
        llegadas.add(corredor)
        val posicion = llegadas.size
        println("$corredor llegó en posición $posicion")
        return posicion
    }

    @Synchronized
    fun mostrarPodio() {
        println("\n=== PODIO FINAL ===")
        llegadas.forEachIndexed { index, corredor ->
            println("${index + 1}° lugar: $corredor")
        }
    }
}

fun main(){
    val ejecutor = Executors.newFixedThreadPool(5)
    val podio = PodioSincronizado()
    for (i in 1..10){
        ejecutor.execute {
            var distancia =0
            while (distancia < 100){
                distancia+=10
            }
            podio.registrarLlegada("Corredor $i")
        }

    }
    ejecutor.shutdown()
    ejecutor.awaitTermination(21, TimeUnit.DAYS)
    podio.mostrarPodio()
}