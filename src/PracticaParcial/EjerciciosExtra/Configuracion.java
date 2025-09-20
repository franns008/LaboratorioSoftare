package PracticaParcial.EjerciciosExtra;

public class Configuracion {
    private static final Configuracion c = new Configuracion();
    private String tema;
    private String idioma;
    private String modoOscuro;

    private Configuracion() {
    }

    public static Configuracion getInstance(){
        return c;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(String modoOscuro) {
        this.modoOscuro = modoOscuro;
    }
}
