
package Resumen;

public class Excepciones {
    public static void main(String[] args) {
        
        int numerador = 10;
        int denominador = 0; 
        
        System.out.println("Iniciando división...");

        // 1. INTENTA HACER LA LOCURA (try)
        
        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        }
        
        // 2. SI FALLA, ATRÁPALO (catch)
        catch (Exception e) {
            System.out.println("ERROR: No se puede dividir por 0"); // Tu mensaje aquí
        }

        // 3. ESTO DEBE SALIR SIEMPRE
        System.out.println("Fin: El programa sigue vivo.");
    }
}