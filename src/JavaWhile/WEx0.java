
package JavaWhile;

import java.util.Scanner;


public class WEx0 {
    public static void main(String[] args) {
    
        Scanner teclat = new Scanner(System.in);
        int suma = 0;
        int comptador = 0;
        System.out.print("Introdueix una nota (-1 per acabar): ");
        int nota = teclat.nextInt();  // Inicialización
        while (nota != -1) {  // Condición
            suma += nota;  // Tratamiento (suma y cuenta)
            comptador++;
            System.out.print("Introdueix una altra nota (-1 per acabar): ");
            nota = teclat.nextInt();  // Actualización
        }
        if (comptador > 0) {
            double mitjana = (double) suma / comptador;
            System.out.println("La mitjana és: " + mitjana);
        } else {
            System.out.println("No s'ha introduït cap nota.");
        }
    }
}
    
    

