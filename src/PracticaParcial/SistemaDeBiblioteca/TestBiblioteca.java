package PracticaParcial.SistemaDeBiblioteca;

import java.time.Year;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestBiblioteca {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        b.add(new Revista("Caras", 2014,5,5));
        Libro l = new Libro("El psicoanalista",2000,"Katzenbatch",400,Genero.NOVELA);
        Libro l1 = new Libro("Misery",1991,"King",500,Genero.NOVELA);
        System.out.println("Libro "+l1.esPrestado());
        l1.prestar();
        System.out.println("Libro "+l1.esPrestado());
        b.add(l1);
        b.add(l);
        b.add(new Revista("Fubol",2019,7,1));
        Iterator<MaterialBiblioteca> i = b.getIterator();
        while (i.hasNext()){
            System.out.println(i.next().descripcion());
        }
        List<MaterialBiblioteca> lista = b.ordenarPorAño(new Comparator<MaterialBiblioteca>() {
            @Override
            public int compare(MaterialBiblioteca o1, MaterialBiblioteca o2) {
                return Integer.compare(o1.añoPublicacion,o2.añoPublicacion);
            }
        });
        Iterator<MaterialBiblioteca> it = lista.iterator();
        System.out.println("============= Lista ordenada ==========");
        while (it.hasNext()){
            System.out.println(it.next().descripcion());
        }
    }

}
