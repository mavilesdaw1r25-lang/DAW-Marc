package EsructuraAlternativa;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int mes;

        System.out.println("Introdueix el numero de mes: ");

        mes = teclat.nextInt();
        int dies = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 ->
                28;
            case 4, 6, 9, 11 ->
                30;
            default ->
                -1;

        };
        
        System.out.println("El numero de dies es: " + dies);
    }
}
