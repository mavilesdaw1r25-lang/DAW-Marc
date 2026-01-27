package PrimeraParte;

import java.util.Scanner;
//String CADENA

public class EjercicioSINO1 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int nota, edat;
        char sexe;

        System.out.println("Introdueix la nota: ");
        nota = teclat.nextInt();
        System.out.println("Introduce la edad: ");
        edat = teclat.nextInt();
        System.out.println("Introduce el sexe (F/M): ");
        sexe = teclat.next().charAt(0);
        if (nota >= 5 && edat >= 18) {
            if (sexe == 'F') {
                System.out.println("Acceptada");
            }
        } else if (sexe == 'M') {
            System.out.println("Possible");

        } else {
            System.out.println("No Acceptada");

        }

    }
}
