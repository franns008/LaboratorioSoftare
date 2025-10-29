package PracticaParcial2.Practica4.Ejercicio4;

import java.util.List;

public class Alumno {
    private int nroAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    List<String> materiaAprobada;
    private int notaAprobacion;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(int nroAlumno, String nombre, String apellido) {
        this.nroAlumno = nroAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(int notaAprobacion, int edad, String apellido, String nombre) {
        this.notaAprobacion = notaAprobacion;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getNroAlumno() {
        return nroAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getMateriaAprobada() {
        return materiaAprobada;
    }

    public int getNotaAprobacion() {
        return notaAprobacion;
    }
}
