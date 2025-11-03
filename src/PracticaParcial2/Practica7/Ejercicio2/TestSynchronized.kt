package PracticaParcial2.Practica7.Ejercicio2

class TestSynchronized(id: String) : Thread(id) {
    var frase: Array<String> = arrayOf("UNLP", "PÚBLICA", "AHORA", "Y", "SIEMPRE")

    override fun run() {
        //synchronized(System.out) {
            for (palabra in frase)
                synchronized(System.out){
                    println("${this.name}: ${palabra} ")
                }

        //}
    }
}
/*
Esto es una seccion critica
 */

fun main(args: Array<String>) {
    val t1 = TestSynchronized("Thread 1")
    val t2 = TestSynchronized("Thread 2")
    val t3 = TestSynchronized("Thread 3")

    t1.start()
    t2.start()
    t3.start()
}
