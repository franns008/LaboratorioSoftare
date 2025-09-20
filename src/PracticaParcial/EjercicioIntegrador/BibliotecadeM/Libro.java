package PracticaParcial.EjercicioIntegrador.BibliotecadeM;

public class Libro extends Medio {


    public Libro(String t, String a) {
        super(t, a);
    }

    @Override
    public void reporducir() {
        System.out.println("Libro");
    }

    @Override
    public Formato tipo() {
        return  Formato.PDF;
    }
}
