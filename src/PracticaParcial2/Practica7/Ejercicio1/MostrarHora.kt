package PracticaParcial2.Practica7.Ejercicio1

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MostrarHora {
    val formato = DateTimeFormatter.ofPattern( "HH:mm:ss")
    fun mostrar() {
        for (i in 1..5) {
            println("Hora actual: " + LocalDateTime.now().format(this.formato))
            Thread.sleep(1000)
        }
    }
    fun mostrarConOtroThread(){
        val t = Thread(){
            for(i in 1..5) {
                println("Hora actual: " + LocalDateTime.now().format(this.formato))
                TimeUnit.SECONDS.sleep(1)
            }
        }
        t.start()
        while(t.isAlive){
        }
        t.join()
    }

    fun mostrarConEjecutor(){
       val e = Executors.newSingleThreadExecutor()
        e.execute {
            for (i in 1..5){
                println("Hora acutal "+ LocalDateTime.now().format(this.formato))
                TimeUnit.SECONDS.sleep(1)
            }
        }

        e.shutdown()

    }

}


fun main() {
    println("Se muestra hora con la funcion Thread.sleep()")
    MostrarHora().mostrar()
    println("Ahora creo otro thread y lo espero")
    MostrarHora().mostrarConOtroThread()
    println("Ahora creo un ejecutor y lo hago correr")
    MostrarHora().mostrarConEjecutor()
}