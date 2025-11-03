package PracticaParcial2.PruebasKotlin

import kotlinx.coroutines.Runnable
import kotlinx.coroutines.runBlocking
import org.jetbrains.annotations.Async
import java.sql.Time
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class EjercicioCloude() {

    fun carreraThread(){
        val corredores = ArrayList<Thread>()
        for (i in 1..5){
            val corredor =thread(start = false){
                var distancia = 0
                while(distancia < 100){
                    distancia+=10
                    println("Corredor $i avanzo $distancia")
                    TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(100,500).toLong())
                }
               println("El corredor $i termino la carrera")
            }
            corredores.add(corredor)
            corredor.start()
        }
        for (c in corredores){
            c.join()
        }

    }
    fun carreraEjecutor(){
        val ejecutor = Executors.newFixedThreadPool(5)
        val listaExecute = ArrayList<Runnable>()
        for (i in 1 ..5){
            listaExecute.add (ejecutor.execute {
                var distancia =0
                while(distancia < 100){
                    distancia+=10
                    println("Corredor $i avanzo $distancia")
                    TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(100,500).toLong())
                }
                println("El corredor $i termino la carrera")
            })
        }
        ejecutor.shutdown()
        ejecutor.awaitTermination(1000, TimeUnit.DAYS)
    }
}

private fun ArrayList<Runnable>.add(e: Any) {}

fun main() {
    EjercicioCloude().carreraEjecutor()
    println("Carrera finalizada")
}