package Practica4.Ejercicio1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Materia m = new Materia("Literatura");
        m.agregaAlumno(new Alumno(56454,"Suarez","Francisco",40140820));
        m.agregaAlumno(new Alumno(78421,"Gutierrez","Franco",4000820));
        m.agregaAlumno(new Alumno(56454,"Gonzalez","Juan",424751));
        m.agregaAlumno(new Alumno(57871,"Molina","Francisco",475412));
        m.agregaAlumno(new Alumno(57871,"Rodriguez","Lucas",3942211));
        m.agregaAlumno(new Alumno(14752,"","",457820));
        for (Alumno a : m.getNominaAlumnos()){
            System.out.println("Alumno "+a.toString());
        }
        /*
       Coleccion ordenada por orden de llegada

         */
        System.out.println("");
        System.out.println("");
        List<Alumno> alumnos = m.getNominaAlumnos();
        alumnos.sort(Comparator.comparing(Alumno::getDni));
        for (Alumno a : alumnos){
            System.out.println("Alumno: "+a.toString());
        }
    }
}
