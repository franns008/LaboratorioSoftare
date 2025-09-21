package PracticaParcial.EjercicioIntegrador.RedSocial;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.Rol;

public class Editor extends Usuario implements Accionable {

    public Editor(String n) {
        super(n,Rol.EDITOR);
    }


    @Override
    public String publicar() {
        return "Te voy a editar la publicacion";
    }

    @Override
    public String comentar() {
        return "Che, esta mal lo que decis, te voy a editar";
    }
}
