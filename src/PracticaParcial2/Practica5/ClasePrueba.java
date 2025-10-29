package PracticaParcial2.Practica5;


@Servidor(
        direccion = "127.0.0.1",
        puerto = 10500,
        archivo = "SalidaServidor.txt"
)
public class ClasePrueba {

    @Invocar
    public String bienvenida(){
        return "Bienvenido a mi servidor con anotadores";
    }

    public String noAparece(){
        return "No deberias ver esto";
    }

    @Invocar
    public String mensajeRandom(){
        return "Este es un mensaje que devuelve cualquier cosa";
    }

    @Invocar
    public void soloPrinteo(){
        System.out.println("Hola printeo esto nomas, pero no retorno nada");
    }
}
