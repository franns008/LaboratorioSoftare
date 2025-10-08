package Practica4.Ejercicio1;

public class Alumno{
    private int legajo;
    private String apellido;
    private String nombre;
    private int dni;

    public Alumno(int legajo, String apellido,
                  String nombre, int dni) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo=" + legajo +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

}
