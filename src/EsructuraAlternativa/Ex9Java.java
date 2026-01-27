
package EsructuraAlternativa;

import java.util.Scanner;


public class Ex9Java {
    public static void main(String[] args) {
        Scanner teclat = new Scanner (System.in);
        System.out.println("Dime un dia ");
        int dia1 = teclat.nextInt();
        
        System.out.println("Dime un mes : ");
        int mes = teclat.nextInt();
        
        int nuevodia = dia1+1;
        int diaymes;
        switch (mes) {
            case 2:
                diaymes = 28;
                break;
            default:
                diaymes = 31;
        };
        if (nuevodia > diaymes) {
            nuevodia = nuevodia -diaymes;
            mes += 1;
            if (mes > 12){
                mes =1;
               
            }
        };
         System.out.println(nuevodia + " " + mes);
         
    }
}
