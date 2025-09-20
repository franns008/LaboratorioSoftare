package PracticaParcial.EjerciciosExtra;

public class Boton {
    private Accion a;

    public Boton(){

    }

    public void setAccion(Accion a){
        this.a = a;
    }

    public void presionar(){
        this.a.ejecutar();
    }
}
