package PracticaParcial.EjerciciosExtra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoggerAvanzadoV2 l = LoggerAvanzadoV2.getLoggerAvanzadoV2();
        l.logInfo("hola");
        l.logError("Chau");
        l.logWarning("Cuidado che");
        l.printAll();

        Configuracion c = Configuracion.getInstance();
        c.setIdioma("Español");
        c.setTema("dark night");
        c.setModoOscuro("Activado");
        System.out.println(c.getIdioma()+" "+c.getModoOscuro()+" "+c.getTema());
        c = Configuracion.getInstance();
        System.out.println(c.getIdioma()+" "+c.getModoOscuro()+" "+c.getTema());

        Boton b = new Boton();
        b.setAccion(new Accion() {
            @Override
            public void ejecutar() {
                System.out.println("Hola mundo");
            }
        });
        b.presionar();
    }
}
