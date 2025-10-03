package PracticaParcial.ReHacerP3.Ej6;

import java.util.Comparator;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private int legajo;
    private int cantMaterias;

    public Estudiante(String nombre, String apellido, int edad, int legajo,
                      int materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.legajo = legajo;
        this.cantMaterias = materias;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", legajo=" + legajo +
                '}';
    }

    public Comparator<Estudiante> getComparadorPorMaterias(){
        return new Comparator<Estudiante>(){

            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Integer.compare(o1.cantMaterias,o2.cantMaterias);
            }
        };
    }
    public Comparator<Estudiante> getComparadorPorEdad(){
        return new Comparator<Estudiante>(){

            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Double.compare(o2.edad,o1.edad);
            }
        };
    }
    public Comparator<Estudiante> getComparadorPorLegajo(){
        return new Comparator<Estudiante>(){

            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Integer.compare(o1.legajo,o2.legajo);
            }
        };
    }
    public Comparator<Estudiante> getComparadorPorNombre(){
        return new Comparator<Estudiante>(){

            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return (o2.nombre+o2.apellido).compareTo(o1.nombre+o2.apellido);
            }
        };
    }
}
