package Practica7.Ejercicio3

import java.lang.classfile.Signature
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.random.Random

object Carrera {
    private val limite = 100

    fun correr(cantidadCorredores: Int){
        val exec = Executors.newFixedThreadPool(cantidadCorredores)
           for (i in 1 .. cantidadCorredores){
               exec.execute {
                   var recorrido = 0
                   while (recorrido < limite){
                       recorrido+=10
                       TimeUnit.MILLISECONDS.sleep((100..1000).random().toLong())
                   }
                   println("Soy el thread "+i+"y termine")
               }

        }
        exec.shutdown()
        try {
            // espera hasta que todos los corredores terminen
            if (!exec.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
                println("⏱ Tiempo de espera agotado (no debería pasar acá)")
            }
        } catch (e: InterruptedException) {
            println("❌ Carrera interrumpida: ${e.message}")
        }

    }

    @JvmStatic
    fun main(args: Array<String>) {
        correr(5)
        println("Ahora una carrera con 3 corredores")
        correr(3)
    }
}