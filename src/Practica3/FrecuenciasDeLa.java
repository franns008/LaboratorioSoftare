package Practica3;

public enum FrecuenciasDeLa {
    ORGANOSALEMANES(480),
    ISO16(440),
    AFINACIONCAMARA(444),
    RENACIMIENTO(446);

    private double frecuenciaEnHZ;
    FrecuenciasDeLa (double frecuencia){
        this.frecuenciaEnHZ = frecuencia;
    }

    public double getFrecuenciaEnHZ() {
        return frecuenciaEnHZ;
    }
}
