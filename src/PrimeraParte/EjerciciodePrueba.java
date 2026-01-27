
package PrimeraParte;

import java.util.Scanner;

public class EjerciciodePrueba {
    public static void main(String[] args) {
     
        Scanner teclat = new Scanner (System.in);
        int valor;
        System.out.println("Introdueix un valor: ");
        valor=teclat.nextInt();
        //IF = SI X ES MAYOR O MENOR QUE X SOUT POSITIVO
        //ELSE = SI NO X NEGATIVO
        if(valor>0){
            System.out.println("Positiu");
        }
        else if (valor < 0) {
            System.out.println("Negativo");
        }
    }
}
