package PracticaParcial.Ejercicio;

import java.util.Date;

public class Documento {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Documento(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", año de Publicacion=" + añoPublicacion +
                '}';
    }
}
