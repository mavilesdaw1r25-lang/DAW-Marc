
package JavaWhile;

import java.util.Scanner;



public class AdvElNum {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        final int VALOR_SECRET = 4;
 
        System.out.println("Adivina el número (1-10):");
        while (true) {
            int numero = teclat.nextInt();
            if (numero == VALOR_SECRET) {
                System.out.println("¡Correcto!");
                break;
            }
            System.out.println("Incorrecto, intenta otra vez:");
        }
        teclat.close();
    }
}

