package PracticaParcial.OtroEjercicio;

public class Moto extends Vehiculo{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public double costoMantenimiento() {
        return 500;
    }
}
