package PracticaParcial2.Practica4.Ejercicio4;

import java.util.List;

public class Facultad {

    private List<Alumno> alumnos;

    public Alumno getAlumnoMejorPromedio(){
        return this.alumnos.stream()
                .max((a,a2) -> Double.compare(a.getNotaAprobacion(),a2.getNotaAprobacion()))
                .get();

    }

    public void imprimirAlumno(){
        alumnos.stream()
                        .limit(2)
                        .forEach(a -> System.out.println(a.toString()));
    }

    public Alumno getAlumnoCursaLabo(){
        return alumnos.stream()
                .filter(a -> a.getMateriaAprobada().equals("Laboratorio de software"))
                .findAny()
                .get();
    }

    public List<Alumno> getAlumnosCoinciden(){
        return alumnos.stream()
                .filter(a -> a.getNombre().startsWith("p") && a.getNombre().length()<=6)
                .toList();
    }
}
