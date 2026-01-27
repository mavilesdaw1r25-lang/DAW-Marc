
package EsructuraAlternativa;

import java.util.Scanner;

public class EstructuraAlternativa {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner (System.in);
          int mayor, numero1, numero2, numero3;
          
          System.out.println("Introduce un numero: ");
          numero1 = teclat.nextInt();
          System.out.println("Introduce el segundo numero: ");
          numero2 = teclat.nextInt();
          System.out.println("Introduce el ultimo numero: ");
          numero3 = teclat.nextInt();
           mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El número més gran és: " + mayor);
        
        teclat.close();
        
    }
}
