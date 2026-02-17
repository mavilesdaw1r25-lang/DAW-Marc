package Resumen2;

import java.util.HashMap;
import java.util.Map;

public class Ej2Mapas {

    public static void main(String[] args) {

        String[] votos = {"Ana", "Pepe", "Ana", "Ana", "Pepe", "Luis"};

        Map<String, Integer> recuento = new HashMap<>();

        System.out.println("--- CONTANDO VOTOS ---");

        // 1. RECORREMOS CADA PAPELITO (VOTO)
        for (String candidato : votos) {

            if (recuento.containsKey(candidato)) {
                int actuales = recuento.get(candidato);
                recuento.put(candidato, actuales + 1);
            } else {
                recuento.put(candidato, 1);
            }
        }
        //RESULTADO FINAL
        System.out.println("Resultado: " + recuento);
    }
}
