package PracticaParcial.SistemaDeBiblioteca;

public enum Genero {
    NOVELA("Novela"),
    HISTORIA("Historia"),
    CIENCIA("Ciencia"),
    INFANTIL("Infantil");

    private String nombreGenero;

    Genero(String s){
    this.nombreGenero = s;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }
}
