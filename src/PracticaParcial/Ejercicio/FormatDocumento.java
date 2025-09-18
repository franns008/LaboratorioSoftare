package PracticaParcial.Ejercicio;

public enum FormatDocumento {
    PDF("pdf"),
    WORD("docx"),
    TEXTO("txt");

    private String extension;

    FormatDocumento(String s){
        this.extension = s;
    }

    public String getExtension(){
        return extension;
    }
}
