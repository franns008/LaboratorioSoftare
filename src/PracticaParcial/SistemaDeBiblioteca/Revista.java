package PracticaParcial.SistemaDeBiblioteca;

import java.util.Date;

public class Revista extends MaterialBiblioteca {
    private int numero;
    private int mes;

    public Revista(String titulo, int añoPublicacion,
                   int numero, int mes) {
        super(titulo, añoPublicacion);
        this.numero = numero;
        this.mes = mes;
    }

    @Override
    public String descripcion() {
        return "Revista "+titulo+" numero "+numero+ " mes "+mes +" Año "+añoPublicacion;
    }

    @Override
    public boolean esPrestado() {
        return false;
    }
}
