package PracticaParcial.EjercicioIntegrador.RedSocial;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.Rol;

public class Lector extends Usuario {

    public Lector(String n ) {
        super(n, Rol.LECTOR);
    }
}
