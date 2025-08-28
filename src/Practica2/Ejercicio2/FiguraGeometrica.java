package Practica2.Ejercicio2;

public  abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    private String color;

    public FiguraGeometrica(String color){
        this.color = color;
    }

    public abstract void dibujar();

    public abstract int area();

    public void setColor (String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public int compareTo(FiguraGeometrica f){
        return Integer.compare(this.area(), f.area());
    }
}
