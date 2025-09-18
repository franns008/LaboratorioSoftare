package PracticaParcial.OtroEjercicio;

public class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        this.cantPuertas = cantPuertas;
    }

    @Override
    public double costoMantenimiento() {
        return 1000+ 100 *cantPuertas;
    }
}
