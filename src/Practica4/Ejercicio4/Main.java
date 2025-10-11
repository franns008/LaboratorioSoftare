package Practica4.Ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Facultad facultad = new Facultad();
        facultad.addAlumnos(new Alumno(65745,"Francisco",
                "Suarez",21,"CPLP",9));
        facultad.addAlumnos(new Alumno(545542,"Juan","Gonzalez",
                25,"OO1",8.4));
        facultad.addAlumnos(new Alumno(54521,"Pedro","Rodriguez",
                54,"Laboratorio de software",7.5));
        facultad.addAlumnos(new Alumno(4545245,"Lucas","Lauriente",35,
                "CADP",8.5));
        facultad.addAlumnos(new Alumno(378219,"Matias","Zicarelli",
                41,"CPLP",7.9));

        List<Alumno> alumnos = facultad.getAlumnos();
        System.out.println("Estudiante con mayor nota: "+
                alumnos.stream().max(Comparator.comparing(Alumno::getNotaPromocion)).get().toString());
        alumnos.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("Alumno que cursa laboratorio "+alumnos.stream()
                .filter(a -> a.getMateria().equals("Laboratorio de software"))
                .findFirst().get().toString());

        System.out.println("Alumno que arranca por P");
        List<Alumno> alumnoP = alumnos.stream()
                .filter(a -> a.getNombre().startsWith("P") && (a.getNombre().length()<=6))
                .toList();
        alumnoP.stream().forEach(System.out::println);


    }


}
