package PracticaParcial.ParicalViejo;

public enum Genero {
    ACCION("Accion"),
    CIENCIAFICCION("Ciencia Ficcion"),
    COMEDIA("comedia"),
    DRAMA("Drama"),
    FANTASIA("Fantasia"),
    MUSICAL("Musical"),
    ROMANCE("Romance"),
    SUSPENSO("Suspenso")

    ;


    private String nombre;
    Genero(String n){
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean soyEseGenero(Genero g){
        return g == this;
    }
}
