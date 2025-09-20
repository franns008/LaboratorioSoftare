package PracticaParcial.EjercicioIntegrador.BibliotecadeM;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.Rol;

public class Cancion extends Medio{

    public Cancion(String t, String a) {
        super(t, a);
    }

    @Override
    public void reporducir() {
        System.out.println("Cancion");
    }

    @Override
    public Formato tipo() {
        return Formato.MP3;
    }
}
