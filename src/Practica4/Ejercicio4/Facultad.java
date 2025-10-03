package Practica4.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private List<Alumno>  alumnos;

    public Facultad(){
        this.alumnos = new ArrayList<>();
    }

    public void addAlumnos (Alumno a){
        this.alumnos.add(a);
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

}
