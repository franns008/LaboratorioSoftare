package PracticaParcial;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Pelicula {
    private String titulo;
    private Date año;
    private String pais;
    private Edades clasificacionEdad;
    private List<Genero> generos;
    private int cantRepr;
    private double valoracion;

    public Pelicula(String titulo, Date año, String pais, Edades clasificacionEdad, List<Genero> generos, int cantRepr, double valoracion) {
        this.titulo = titulo;
        this.año = año;
        this.pais = pais;
        this.clasificacionEdad = clasificacionEdad;
        this.generos = generos;
        this.cantRepr = cantRepr;
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public Edades getClasificacionEdad() {
        return clasificacionEdad;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public int getCantRepr() {
        return cantRepr;
    }

    public double getValoracion() {
        return valoracion;
    }

}
