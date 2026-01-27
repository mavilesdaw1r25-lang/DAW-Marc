package EsructuraAlternativa;

import java.util.Scanner;

public class Ex8Java {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int edat, dia, mes, any;
        int diaActual, mesActual, anyActual;

        System.out.println("Indica el dia que naciste: ");
        dia = teclat.nextInt();

        System.out.println("Indica el mes: ");
        mes = teclat.nextInt();

        System.out.println("Indica el año: ");
        any = teclat.nextInt();

        System.out.println("Indica el dia actual: ");
        diaActual = teclat.nextInt();

        System.out.println("Indica el mes actual: ");
        mesActual = teclat.nextInt();

        System.out.println("Indica el año actual: ");
        anyActual = teclat.nextInt();

        edat = anyActual - any;

        if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
            edat--;
            System.out.println("Tienes: " + edat + "año");
            if (edat >= 18) {
                System.out.println("Eres mayor de edat");
            } else {
                System.out.println("Eres menor de edat");
            }

        }
    }
}
