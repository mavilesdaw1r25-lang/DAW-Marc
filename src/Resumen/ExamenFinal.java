package Resumen;

import java.util.HashMap;
import java.util.Map;

public class ExamenFinal {

    public static void main(String[] args) {

        // 1. DATOS DE ENTRADA (NO TOCAR)
        Map<String, String> notas = new HashMap<>();
        notas.put("Ana", "8");
        notas.put("Luis", "4");
        notas.put("Pepe", "NP");      // ¡Trampa!
        notas.put("Maria", "10");
        notas.put("Juan", "Error");   // ¡Trampa!
        notas.put("Lucia", "5");

        // -------------------------------------------------
        // ESCRIBE TU CÓDIGO AQUÍ DEBAJO
        // Tienes que recorrer el mapa, convertir, filtrar y mostrar.
        // -------------------------------------------------
        System.out.println("--- LISTA DE APROBADOS ---");
        for (Map.Entry<String, String> par : notas.entrySet()) {

            String nombre = par.getKey();
            String notaTexto = par.getValue(); 
            try {
                int nota = Integer.parseInt(notaTexto);

                if (nota >= 5) {
                    System.out.println(nombre + " ha aprobado con un " + nota);
                }
            } catch (NumberFormatException e) {
            }
        }
    }
}

