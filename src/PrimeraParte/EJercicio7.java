
package PrimeraParte;

import java.util.Scanner;

public class EJercicio7 {
    public static void main(String[] args) {
        Scanner teclat= new Scanner (System.in);
        double base, venda1, venda2, venda3, comissio;
        System.out.println("Indica el sou base: ");
        base= teclat.nextDouble();
        System.out.println("Indica import primera venda1: ");
        venda1= teclat.nextDouble();
        System.out.println("Indica import segona venda 2: ");
        venda2= teclat.nextDouble();
        System.out.println("INdica import tercera venda 3: ");
        venda3= teclat.nextDouble();
        comissio = venda1 * 0.1 + venda2 * 0.1 + venda3 * 0.1;
        System.out.println("Comissio per vendes: " + comissio);
        System.out.println("Sou total: " + base);
    }
    
}
