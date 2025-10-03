package PracticaParcial.SistemaDeBiblioteca;

import java.util.Date;

public class Libro extends MaterialBiblioteca implements Prestable{
    private String autor;
    private int cantPaginas;
    private boolean prestado;
    private Genero genero;

    public Libro(String titulo, int añoPublicacion,
                 String autor, int cantPaginas, Genero g) {
        super(titulo, añoPublicacion);
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.prestado = false;
        this.genero = g;
    }

    @Override
    public String descripcion() {
        return "Titulo del libro "+titulo+" Autor "+autor+" Cantidad de paginas "+cantPaginas+" Año "+añoPublicacion;
    }

    @Override
    public boolean esPrestado() {
        return prestado;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
