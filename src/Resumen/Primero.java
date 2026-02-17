
package Resumen;

import java.util.Arrays;
public class Primero {
    public static void main(String[] args) {
        
        // 1. Dos tablas con algunos números iguales
        int[] grupoA = {10, 20, 30, 40, 50};
        int[] grupoB = {5, 20, 15, 50, 60};
        
        System.out.print("Números repetidos: ");

        // 2. BUCLE PADRE: Recorre el grupoA (usa 'i')
        for (int i = 0; i < grupoA.length; i++) {
            
            int numeroA = grupoA[i]; // Cogemos el número del grupo A
            
            // 3. BUCLE HIJO: Recorre el grupoB (usa 'j')
            // Por cada número de A, miramos TODOS los de B para ver si hay coincidencia
            for (int j = 0; j < grupoB.length; j++) {
                
                // 4. CONDICIÓN: Si el numeroA es igual a grupoB[j]...
                if ( numeroA == grupoB[j] ) {
                    System.out.print(numeroA + " ");
                }
                
            }
        }
    }
}