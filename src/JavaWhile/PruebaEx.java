
package JavaWhile;

import java.util.Scanner;


public class PruebaEx {


     public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número:");
        int num = teclat.nextInt();
        
         for (int i = 1; i <= num; i++) {
             for (int j = 1; j <= num; j++) {
                 if (j==1 || j==num || i==j){
                     System.out.print("# ");
                 }else{
                     System.out.print("  ");
                 }
             }
             System.out.println("");
         }
     }
}

