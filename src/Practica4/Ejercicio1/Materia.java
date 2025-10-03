package Practica4.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String informacion;
    private List<Alumno> nominaAlumnos;

    public Materia(String informacion) {
        this.informacion = informacion;
        this.nominaAlumnos = new ArrayList<>();
    }

    public void agregaAlumno(Alumno a){
        this.nominaAlumnos.add(a);
    }

    public List<Alumno> getNominaAlumnos() {
        return nominaAlumnos;
    }
}
