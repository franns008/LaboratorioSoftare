package PracticaParcial.EjercicioIntegrador.RedSocial;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.Rol;

public class Admin extends Usuario implements Accionable{

    public Admin(String n) {
        super(n, Rol.ADMIN);
    }

    @Override
    public String publicar() {
        return "Soy administrador, ojo conmigo";
    }

    @Override
    public String comentar() {
        return "Soy administrador, te voy a bloquear";
    }
}
