package Practica3.Ejercicio8;

public interface InstrumentoMusical {
    void hacerSonar();
    void hacerSonar(Notas n, int duracion);
    String queEs();
    default void afinar(){

    }
    default void afinar(FrecuenciasDeLa f){

    }
}

