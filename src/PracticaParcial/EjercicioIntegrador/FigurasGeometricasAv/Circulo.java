package PracticaParcial.EjercicioIntegrador.FigurasGeometricasAv;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, Color c) {
        super(c);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI *Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Se esta dibujando un circulo de radio"
        + radio+" color "+color);
    }
}
