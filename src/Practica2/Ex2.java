package Practica2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "[A-Z]{3}-\\d{4}";
        Pattern pat = Pattern.compile(regex);

        boolean esValido = false;

        while (!esValido) {
            System.out.println("Introduce el codigo (Ej. ABC-1234):");
            
            String entrada = sc.nextLine();

            Matcher m = pat.matcher(entrada);
            if (m.matches()) {
                System.out.println("Codigo aceptado");
                esValido = true;
            } else {
                System.out.println("Error el formato debe ser LLL-NNNN");

            }

        }
    }
}
