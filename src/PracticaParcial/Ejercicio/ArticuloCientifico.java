package PracticaParcial.Ejercicio;

public class ArticuloCientifico extends Documento {
    private String revista;

    public ArticuloCientifico(String titulo, String autor,
                              int añoPublicacion, String revista) {
        super(titulo, autor, añoPublicacion);
        this.revista = revista;
    }

    @Override
    public String toString() {
        return super.toString()+" Revista "+this.revista;
    }
}
/*
Declara el constructor de Documento como private. No se puede instanciar esa
clase debido a que no se puede acceder al constructor de la misma. Tampoco va a poder ser
heredada ya que no se va a poder hacer uso del constructor de super


) Declara el constructor de Documento como protected.
Si se declara como protected, solo van a poder se va a poder llamar desde una
clase que la extienda. Va a poder ser extendida pero su constructor solo va
a poder ser llamado por esa clase
 */