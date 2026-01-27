
package PrimeraParte;

import java.util.Scanner;

public class EjercicioJavaX {
    public static void main(String[] args) {
        int num1, resultat;
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce el numero: ");
        
        num1= lector.nextInt();
        
        if (num1 % 2 == 0) {
            resultat = num1 *2 + 3;
            System.out.println("El numero " + num1 + "es par, se multiplica por 2 y se + 3.");
        }else{
            resultat = num1 *3 - 4;
            System.out.println("El numero " + num1 + "es impar, se multiplica por 3 y se -4");
           
        }
         System.out.println("Resultat: " + resultat);
        
        lector.close();
    }
}
