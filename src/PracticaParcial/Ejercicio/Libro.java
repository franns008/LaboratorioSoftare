package PracticaParcial.Ejercicio;

public class Libro extends Documento {
    private int isbn;

    public Libro(String titulo, String autor,
                 int añoPublicacion, int isbn) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString()+ "isbn "+this.isbn;
    }
}
