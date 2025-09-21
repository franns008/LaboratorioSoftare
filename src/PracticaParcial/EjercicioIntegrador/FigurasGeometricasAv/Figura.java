package PracticaParcial.EjercicioIntegrador.FigurasGeometricasAv;

public abstract class Figura implements Centrable {
    protected Color color;
    protected double centroX;
    protected double centroY;

    public Figura(Color color) {
        this.color = color;
    }

    @Override
    public void setCentro(double x, double y) {
        this.centroX = x;
        this.centroY = y;
    }

    @Override
    public double getCentrox() {
        return centroX;
    }
    @Override
    public double getCentroY() {
        return centroY;
    }

    public abstract double area();
    public abstract void dibujar();

}
