package JavaWhile;

import java.util.Scanner;

public class WEx7 {


        public static void main(String[] args) {
          Scanner teclat = new Scanner (System.in);
          int num , divisor =2;
            System.out.println("INtrodueix un valor positivo: ");
            
            num= teclat.nextInt();
            while ((divisor<=num)&&(num%divisor!=0)){
                divisor++;
            }
            if(divisor==num){ 
                System.out.println("Primer");
                
            }
            else{
                System.out.println("No es primer");
                
            }
         
        }
    }

