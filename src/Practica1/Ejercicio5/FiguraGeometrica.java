package Practica1.Ejercicio5;

public  abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica (String color){
        this.color = color;
    }

    public abstract void dibujar();

    public abstract double area();

    public void setColor (String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }


}
