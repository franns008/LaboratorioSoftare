package PracticaParcial.EjercicioIntegrador.FigurasGeometricasAv;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura,Color c) {
        super(c);
        this.base = base;
        this.altura = altura;

    }


    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo un rectangulo de base"+
                base + " altura "+altura+" color "+color);
    }
}
