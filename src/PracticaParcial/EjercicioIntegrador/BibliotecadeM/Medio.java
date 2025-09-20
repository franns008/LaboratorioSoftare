package PracticaParcial.EjercicioIntegrador.BibliotecadeM;

public abstract class Medio {
    protected String titulo;
    protected String autor;

    public Medio(String t, String a){
        this.autor = a;
        this.titulo = t;
    }

    public abstract void reporducir();
    public abstract Formato tipo();

}
