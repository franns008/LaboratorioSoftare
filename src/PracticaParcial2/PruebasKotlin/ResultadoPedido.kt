package PracticaParcial2.PruebasKotlin

import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit

data class ResultadoPedido(
    val id: Int,
    val tiempoMs: Long,
    val costo: Double
){
    override fun toString(): String {
        return "ID: $id, con tiempo en milisegundos $tiempoMs y costo $costo"
    }
}
class Ejercicio{
    fun crearPedidos(numThreads:Int){
        val listaResultado = ArrayList<Future<ResultadoPedido>>()
        val ejecutor = Executors.newFixedThreadPool(numThreads)
        for (i in 1..10) {
            listaResultado.add(ejecutor.submit<ResultadoPedido> {
                 val res = ResultadoPedido(id =i,
                    tiempoMs = ThreadLocalRandom.current().nextLong(1000,5000),
                    costo = ThreadLocalRandom.current().nextDouble(500.0,2000.0)
                )
                return@submit res
            }
            )
        }
        println("Promedio tiempo en MS "+listaResultado.stream()
            .mapToLong { r -> r.get().tiempoMs }
            .average()
            .asDouble)
        println("Costo total "+ listaResultado.stream()
            .mapToDouble { r -> r.get().costo }
            .sum())
        ejecutor.shutdown()
    }
}



fun main() {
    Ejercicio().crearPedidos(5)
    println("========= Ejercicio con 3 threads =========")
    Ejercicio().crearPedidos(3)
}