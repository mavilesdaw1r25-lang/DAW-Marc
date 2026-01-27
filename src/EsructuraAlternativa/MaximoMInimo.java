
package EsructuraAlternativa;

import java.util.Scanner;


public class MaximoMInimo {
    
   public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numero, max = 0, min = 0;
        
        System.out.println("Introduce el primer numero: ");
        numero = teclat.nextInt();
        max = numero;
        min = numero;
        
        for (int i = 2; i <= 5; i++) {
            System.out.println("Introduce un numero: ");
            numero = teclat.nextInt();
            
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        
        teclat.close();
    } 
    
}

