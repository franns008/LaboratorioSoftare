package Practica7.Ejercicio3b

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class CarreraAbandonar {

    private val limite = 100
    fun correr(cantidadCorredores: Int)  {
        val exec = Executors.newFixedThreadPool(cantidadCorredores)
        val participantesCorriendo =  mutableListOf<Pair<Int, Future<Int>>>()
        for (i in 1 .. cantidadCorredores){
            val id = i
            val participante = Callable{
                var recorrido = 0
                while (recorrido < limite){
                    recorrido+=10
                    TimeUnit.MILLISECONDS.sleep((100..1000).random().toLong())
                    //una forma de hacer que no siempre gane el mismo
                }
                1
            }
            participantesCorriendo.add(id to exec.submit(participante))


        }
        for ((i,p)in participantesCorriendo){
            if(p.get()==1){
                println("El participante $i termino la carrera")
            }else{
                println("El participante $i no logro finalizar la carrera")
            }
        }

        exec.shutdown()
        exec.awaitTermination(2, TimeUnit.MINUTES)

    }


}
fun main(args: Array<String>) {
    var carrera = CarreraAbandonar()
    carrera.correr(5)
    println("Ahora una carrera con 3 corredores")
    carrera.correr(3)
}