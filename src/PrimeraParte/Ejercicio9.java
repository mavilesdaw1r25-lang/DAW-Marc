
package PrimeraParte;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclat= new Scanner (System.in);
         int num1, num2, aux;
         System.out.println("Introdueix valor de la variable num1: ");
         num1= teclat.nextInt();
         System.out.println("Introdueix valor de la variable num2: ");
         num2= teclat.nextInt();
         aux = num1;
         num1 = num2;
         num2 = aux;
         System.out.println("Nou valor de num1: " + num1);
         System.out.println("Nou valor de num2: " + num2);
         
    }
}
