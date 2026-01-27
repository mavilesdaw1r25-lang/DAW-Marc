package EsructuraAlternativa;

import java.util.Scanner;

public class Imprimir2 {

    public static void main(String[] args) {

        //for (cont=valorInicial;condiciio per continuar increment o decrement)
        Scanner teclat = new Scanner(System.in);
        int numero, max = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce un numero: ");
            numero = teclat.nextInt();
            if (numero > max) {
                max = numero;
             
            }
        }
        System.out.println("El maxim es: " + max);
    }
}
