package Practica1.Ejercicio5;

public class Rectangulo extends FiguraGeometrica {
    private double alto;
    private double ancho;

    public Rectangulo(String color, double alto, double ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return ancho*alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un cuadrado de area "+this.area()+" de color "+this.getColor());
    }

}
