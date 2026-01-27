
import java.util.Scanner;

public class IntFallidos {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        final int VALOR_SECRET = 4;
        int intents = 3;

        System.out.println("Adivina el número (1-10). Tienes 3 intentos:");

        while (intents > 0) {
            int numero = teclat.nextInt();
            if (numero == VALOR_SECRET) {
                System.out.println("¡Correcto!");
                teclat.close();
                return;
            }
            intents--;
            System.out.println("Incorrecto. Te quedan " + intents + " intentos:");
        }
        
        System.out.println("Game over. El número era " + VALOR_SECRET);
        teclat.close();
    }
}