package Practica3.Ejercicio8;

import Practica2.Ejercicio1.InstrumentoMusical;

public class InstrumentoDeCuerda implements InstrumentoMusical {
    public void hacerSonar(){
        System.out.println("Sonar Cuerdas");
    }
    public String queEs() {
        return "Instrumento de Cuerda";
    }
}
