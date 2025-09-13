package Practica3;

import Practica2.Ejercicio1.InstrumentoMusical;

public abstract class InstrumentoDeViento implements InstrumentoMusical {
    public void hacerSonar(){
        System.out.println("Sonar Vientos");
    }
    public String queEs() {
        return "Instrumento de Viento";
    }
}

