package PracticaParcial.SistemaDeBiblioteca;

import java.sql.Time;
import java.util.Date;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected int añoPublicacion;

    public MaterialBiblioteca(String titulo, int añoPublicacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public abstract String descripcion();
    public abstract boolean esPrestado();
}
