package PracticaParcial.OtroEjercicio;

public abstract class Vehiculo {
    private String marca;
    private String Modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        Modelo = modelo;
    }

    public abstract double costoMantenimiento();

}
