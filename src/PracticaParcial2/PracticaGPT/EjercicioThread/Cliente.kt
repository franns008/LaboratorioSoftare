package PracticaParcial2.PracticaGPT.EjercicioThread

import com.sun.source.util.TaskEvent
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import java.util.random.RandomGenerator
import kotlin.random.Random

class Cliente(private var nombre:String, private var saldo: Double): Runnable {
    private var cuentaBancaria = CuentaBancaria(saldo)

    fun extraer(monto: Double):Boolean{
        return this.cuentaBancaria.extraer(monto)
    }

    override fun run() {
        val resultadoExtraccion = this.extraer(600.0)
        if(resultadoExtraccion){
            println("se pudo extraer correctamente")
        }else{
            println("La extraccion no pudo realizarse," +
                    " no cuenta con el dinero suficiente en la cuenta")
        }
        TimeUnit.MILLISECONDS.sleep((100..1000).random().toLong())

    }


}

fun main() {
    val ejecutor = Executors.newFixedThreadPool(5)

    println("=== Simulación de clientes ===")

    // Crear y ejecutar 5 clientes en paralelo
    repeat(5) { i ->
        val cliente = Cliente(
            nombre = "Cliente-${i + 1}",
            saldo = ThreadLocalRandom.current().nextDouble(200.0, 3000.0)
        )
        ejecutor.execute(cliente)
    }

    ejecutor.shutdown()


}