package Practica7.Ejercicio3

import java.lang.classfile.Signature
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class Carrera {
    private val limite = 100

    fun correr(cantidadCorredores: Int){
        val exec = Executors.newFixedThreadPool(cantidadCorredores)
           for (i in 1 .. cantidadCorredores){
               exec.execute {
                   var recorrido = 0
                   while (recorrido < limite){
                       recorrido+=10
                       TimeUnit.MILLISECONDS.sleep((100..1000).random().toLong())
                       //una forma de hacer que no siempre gane el mismo
                   }
                   println("Soy el thread "+i+"y termine")
               }

        }
        exec.shutdown()
        exec.awaitTermination(2, TimeUnit.MINUTES)

    }


}

fun main(args: Array<String>) {
    var carrera = Carrera()
    carrera.correr(5)
    println("Ahora una carrera con 3 corredores")
    carrera.correr(3)
}