
package PrimeraParte;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
       Scanner teclat= new Scanner (System.in);
       double parcial1, parcial2, parcial3, examen, treball, nota;
       
        System.out.println("Indica la nota parcial 1: ");
        parcial1= teclat.nextDouble();
        System.out.println("INdica la nota del parcial 2: ");
        parcial2= teclat.nextDouble();
        System.out.println("Indica la nota del parcial 3: ");
        parcial3= teclat.nextDouble();
        System.out.println("Indica la nota del examen: ");
        examen= teclat.nextDouble();
        System.out.println("Indica la nota del treball: ");
        treball= teclat.nextDouble();
        nota = ((parcial1 + parcial2 + parcial3)/3)* 0.55 + 0.3* examen +0.15*treball;
        
        System.out.println("Nota final: " + nota);
        
                
    }
}
