
package Resumen2;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        
        int[] codigos = {4, 7, 2, 10, 5};
        int objetivo = 12;
        
        System.out.println("Buscando pareja que sume " + objetivo + "...");

        // PISTA PARA EL BUCLE ANIDADO:
        // El bucle 'i' coge un número.
        // El bucle 'j' tiene que empezar SIEMPRE uno por delante de 'i' (j = i + 1)
        // para no repetir parejas ni sumarse a sí mismo.

        // 1. PRIMER BUCLE (Recorre todos)
        for (int i = 0; i < codigos.length; i++) {
            
            // 2. SEGUNDO BUCLE (Busca pareja desde la siguiente posición)
            for (int j = i + 1; j < codigos.length; j++) {
                
                // 3. CONDICIÓN: Si i + j es igual al objetivo...
                if ( codigos[i] + codigos[j] == objetivo) {
                    System.out.println("¡ENCONTRADO! Son " + codigos[i] + " y " + codigos[j]);
                    
                    // Opcional: Si solo queremos una pareja, aquí podríamos poner un 'return;' para acabar.
                }
            }
        }
    }
}