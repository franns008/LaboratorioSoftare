package PracticaParcial2.Practica5;


@Servidor(
        direccion = "127.0.0.1",
        puerto = 10500,
        archivo = "SalidaServidor.txt"
)
public class ClasePruebaConMetodosStatic {

    @Invocar
    public static String bienvenida(){
        return "Bienvenido a mi servidor con anotadores";
    }

    public static String noAparece(){
        return "No deberias ver esto";
    }

    @Invocar
    public static  String mensajeRandom(){
        return "Este es un mensaje que devuelve cualquier cosa";
    }

    @Invocar
    public static void soloPrinteo(){
        System.out.println("Hola printeo esto nomas, pero no retorno nada");
    }
}
