package Resumen;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        // 1. Lista de edades mezcladas
        List<Integer> edades = Arrays.asList(15, 22, 12, 35, 17, 80);

        System.out.println("--- LISTA DE ADMITIDOS (+18) ---");

        // 2. ABRIMOS LA TUBERÍA (stream)
        edades.stream()
                // 3. EL FILTRO (Aquí es donde trabajas tú)
                // Tienes que decir: "deja pasar si edad es >= 18"
                .filter(edad -> edad >=18)
                // 4. IMPRIMIR CADA UNO QUE SALGA
                .forEach(edad -> System.out.println("Pasa: " + edad));
    }
}

