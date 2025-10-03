package Practica4.Ejercicio3;

import java.util.*;

public class Comparacion {

    // Calcula distancia de Levenshtein entre dos strings
    private static int levenshtein(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) dp[i][0] = i;
        for (int j = 0; j <= s2.length(); j++) dp[0][j] = j;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int costo = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(
                        Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1),
                        dp[i - 1][j - 1] + costo
                );
            }
        }
        return dp[s1.length()][s2.length()];
    }

    // Motor de comparación
    public static List<String> comparar(String cadena, Map<String, List<String>> diccionario) {
        cadena = "#" + cadena + "$";


        List<String> gramas = new ArrayList<>();
        for (int i = 0; i < cadena.length() - 1; i++) {
            gramas.add(cadena.substring(i, i + 2));
        }

        Set<String> candidatos = new HashSet<>();

        // Buscar todas las palabras que comparten al menos un grama
        for (String g : gramas) {
            if (diccionario.containsKey(g)) {
                candidatos.addAll(diccionario.get(g));
            }
        }

        // Filtrar usando Levenshtein
        List<String> resultado = new ArrayList<>();
        for (String palabra : candidatos) {
            if (levenshtein(palabra, cadena.replace("#", "").replace("$", "")) < 3) {
                resultado.add(palabra);
            }
        }

        return resultado;
    }
}
