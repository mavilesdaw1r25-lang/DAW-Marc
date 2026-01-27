
package PrimeraParte;

import java.util.Scanner;

public class Ejercicios {

  
    public static void main(String[] args) {
    
        int numero;
        numero=9;  //Donar valor a la variable <-
        //Real (double)
        double area =9.8;
        //logico (boolean(;
        boolean aprovat=true;  //false
        //Caracter (char)
        char lletra = 'a';
        //Texto (String)
        String nom="Albert";
        //sout escribir 
        Scanner   teclat = new Scanner (System.in);
        System.out.print("Escriu el teu nom: ");
        //nom= teclat.next(); //Next lee una palabra
        nom = teclat.nextLine();
        System.out.println("El teu nom es: "+ nom);
    }
    
}
