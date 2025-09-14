package Practica3.Ejercicio8;

public enum Notas {
    LA("A",256.63),
    DO("C",261.63),
    RE("D",293.66),
    MI ("E",329.63),
    FA("F",440.00),
    SI("B",493.88);
    private String cifradoAmericano;
    private double frecuenciaHZ;

    Notas(String cifrado,double frec){
        this.cifradoAmericano=cifrado;
        this.frecuenciaHZ = frec;
    }

    public String getCifradoAmericano() {
        return cifradoAmericano;
    }

    public double getFrecuenciaHZ() {
        return frecuenciaHZ;
    }
}
