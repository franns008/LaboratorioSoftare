package Practica2.Ejercicio1;

public interface InstrumentoMusical {
    void hacerSonar();
    String queEs();
    default void afinar(){

    }
}

