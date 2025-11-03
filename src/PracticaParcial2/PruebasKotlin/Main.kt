package PracticaParcial2.PruebasKotlin

import java.util.concurrent.Callable

class  Main {
}

fun main(){
    val listaConNulls: List<String?> = listOf("Kotlin",null,"Hola",null)

    for (e in listaConNulls){
        e?.let { println(e) }
    }

}