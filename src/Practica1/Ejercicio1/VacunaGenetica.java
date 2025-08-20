package Practica1.Ejercicio1;

public class VacunaGenetica extends Vacuna{
    private double tempMinima;
    private double tempMaxima;

    public VacunaGenetica(String marca, String paisOrigen, String enfermedadPreviene, int cantDosis, double tempMinima, double tempMaxima) {
        super(marca, paisOrigen, enfermedadPreviene, cantDosis);
        this.tempMinima = tempMinima;
        this.tempMaxima = tempMaxima;
    }

    public double getTempMinima() {
        return tempMinima;
    }

    public void setTempMinima(double tempMinima) {
        this.tempMinima = tempMinima;
    }

    public double getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(double tempMaxima) {
        this.tempMaxima = tempMaxima;
    }
}
