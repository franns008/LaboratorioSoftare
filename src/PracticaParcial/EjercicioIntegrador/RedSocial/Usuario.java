package PracticaParcial.EjercicioIntegrador.RedSocial;

import PracticaParcial.EjerciciosExtra.SistemaDeUsuarios.Rol;

public class Usuario {
    private String nombre;
    private Rol rol;

    public Usuario(String n, Rol r){
        this.nombre = n;
        this.rol = r;
    }

    public String getNombre() {
        return nombre;
    }

    public Rol getRol() {
        return rol;
    }
}
