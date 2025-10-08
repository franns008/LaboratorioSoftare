package Practica4.Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMatching {

    private Map<String,List<String>> diccionario;
    private int q;


    public StringMatching() {
        this.diccionario = new HashMap<>();
        q=2;
    }

    public void setCadena(String c){
        String cadena = "#"+c+"$";
        for (int i = 0; i <= cadena.length() - 1; i++) {
            String grama = cadena.substring(i, i + q);

            // si no existe la clave, se crea la lista
            diccionario.putIfAbsent(grama, new ArrayList<>());
            diccionario.get(grama).add(c);
        }
    }

    public Map<String, List<String>> getDiccionario() {
        return diccionario;
    }

    public int getQ() {
        return q;
    }

    public static void main(String[] args) {



    }
}
