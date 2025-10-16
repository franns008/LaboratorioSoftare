package Practica7.Ejercicio1

import kotlinx.coroutines.delay
import java.time.LocalDateTime
import kotlin.concurrent.thread
import kotlin.coroutines.*;
import kotlinx.coroutines.*;

object MostrarHoraActual {
    fun implementacion1() {
        for (i in 0..9) {
            try {
                println("Hora actual " + LocalDateTime.now().toString())
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                println("Thread interrumpido")
            }
        }
    }

    fun implementacion2() {

        runBlocking{
            for (i in 0 .. 9){
                println("Hora actual "+ LocalDateTime.now())
                delay(1000)
            }

        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        implementacion1()
        println("Implementacion 2:")
        implementacion2()
    }
}