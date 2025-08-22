package Practica1.Ejercicio5;


public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return this.radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }


    @Override
    public void dibujar() {
        System.out.println("Se dibuja un ciculo con radio "+this.radio+" y color "+this.getColor());
    }
}
