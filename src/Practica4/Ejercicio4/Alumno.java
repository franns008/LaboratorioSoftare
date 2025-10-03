package Practica4.Ejercicio4;

public class Alumno {
    private int nroAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private String materia;
    private double notaPromocion;

    public Alumno(int nroAlumno, String nombre, String apellido) {
        this.nroAlumno = nroAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(int nroAlumno, String nombre, String apellido,
                  int edad, String materia, double notaPromocion) {
        this.nroAlumno = nroAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materia = materia;
        this.notaPromocion = notaPromocion;
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

    public String getMateria() {
        return materia;
    }

    public double getNotaPromocion() {
        return notaPromocion;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nroAlumno=" + nroAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", materia='" + materia + '\'' +
                ", notaPromocion=" + notaPromocion +
                '}';
    }
}
