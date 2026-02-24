
package Resumen2;


import java.util.Scanner;

public class Ejercicio4ExcepcionesPro {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        boolean datoValido = false; // Semáforo en rojo
        
        System.out.println("--- CONTROL DE ACCESO ---");

        // BUCLE: Mientras el dato NO sea válido (!datoValido)... repite
        while ( !datoValido ) {
            
            try {
                System.out.print("Introduce tu edad (número): ");
                String texto = teclado.nextLine(); // Leemos texto para evitar líos de buffer
                
                // 1. INTENTA CONVERTIR (Zona Peligrosa)
                edad = Integer.parseInt( texto);
                // 2. SI LLEGAMOS AQUÍ, TODO HA IDO BIEN.
                // Cambia el semáforo a verde para salir del bucle.
                datoValido = true ; 
                
            } catch (NumberFormatException e) {
                // 3. SI FALLA (escribió letras)
                System.out.println("❌ Error: ¡Eso no es un número! Prueba otra vez.");
            }
        }
        
        System.out.println("✅ Edad registrada: " + edad + " años.");
    }
}