
package PrimeraParte;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner teclat= new Scanner (System.in);
        
        System.out.println("Monedas de 2 euros: ");
        int euro2= teclat.nextInt();
        
        System.out.println("Moneda de 1 euro: ");
        int euro1= teclat.nextInt();
        
        System.out.println("Moneda de 50 centimos: ");
        int cent50= teclat.nextInt();
        
        System.out.println("Monedes de 20 centims: ");
        int cent20= teclat.nextInt();
        
        System.out.println("Monedas de 10 centimos: ");
        int cent10= teclat.nextInt();
        
        int total_euros = euro2 * 2 + euro1;
        
        int total_centims = cent50 * 50 + cent20 * 20 + cent10 * 10;
        total_euros = total_euros + trunc(total_centims / 100);
        total_centims= total_centims % 100;
        System.out.println(total_euros + "euros i total centims: " + total_centims);
        
        
    }

    private static int trunc(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
