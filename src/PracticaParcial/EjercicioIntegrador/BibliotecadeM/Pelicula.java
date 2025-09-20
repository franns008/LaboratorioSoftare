package PracticaParcial.EjercicioIntegrador.BibliotecadeM;

public class Pelicula extends Medio implements Descargable{
    public Pelicula(String t, String a) {
        super(t, a);
    }

    @Override
    public void reporducir() {
        System.out.println("Pelicula");
    }

    @Override
    public Formato tipo() {
        return Formato.EPUB;
    }


    @Override
    public void descargar() {
        System.out.println("Descargando la pelicula "+this.titulo);
    }

    @Override
    public void tamañoKB() {
        System.out.println("esta pelicula pesa mucho");
    }
}
