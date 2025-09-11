package Practica3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Estudiante {
    private String apellido;
    private String nombre;
    private int edad;
    private int legajo;
    private int cantMateriasAprobadas;

    public Estudiante(String apellido, String nombre, int edad, int legajo, int matAprobadas) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.legajo = legajo;
        this.cantMateriasAprobadas = matAprobadas;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getCantMateriasAprobadas() {
        return cantMateriasAprobadas;
    }
    public Comparator sortCantMat(){
        return  new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return  o1.cantMateriasAprobadas - o2.cantMateriasAprobadas;
            }
        };
    }
    public Comparator sortEdad(){
        return new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o2.edad - o1.edad;
            }
        };
    }

    public Comparator sortLegajo(){
        return new Comparator<Estudiante>(){

            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.legajo - o2.legajo;
            }
        };
    }

    public Comparator sortNombreApellido(){
        return new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                int cmp = o2.nombre.compareTo(o1.nombre); // nombre descendente
                if (cmp == 0) {
                    return o2.apellido.compareTo(o1.apellido); // apellido descendente
                }
                return cmp;
            }
        };
    }

    public static void main(String[] args) {
        Estudiante[] a = {
                new Estudiante("suarez","francisco",20,5546,5),
                new Estudiante("gonzalez","juan",36,54546,7),
                new Estudiante("gutierrez","lucas",26,14446,2),
                new Estudiante("gutierrez","matias",46,25446,10)
        };
        for (Estudiante e : a ){
            System.out.println("Datos estudiante "+e.getNombre()+" "+e.getApellido()+" "+e.getEdad()+" "+e.getLegajo());
        }
        Arrays.sort(a,a[0].sortEdad());
        System.out.println("Edad: ");
        for (Estudiante e : a ){
            System.out.println("Datos estudiante "+e.getNombre()+" "+e.getApellido()+" "+e.getEdad()+" "+e.getLegajo());
        }
        System.out.println(" Nombre y Apellido ");
        Arrays.sort(a,a[0].sortNombreApellido());
        for (Estudiante e : a ){
            System.out.println("Datos estudiante "+e.getNombre()+" "+e.getApellido()+" "+e.getEdad()+" "+e.getLegajo());
        }

        System.out.println(" Legajo ");
        Arrays.sort(a,a[0].sortLegajo());
        for (Estudiante e : a ){
            System.out.println("Datos estudiante "+e.getNombre()+" "+e.getApellido()+" "+e.getEdad()+" "+e.getLegajo());
        }

    }
}
