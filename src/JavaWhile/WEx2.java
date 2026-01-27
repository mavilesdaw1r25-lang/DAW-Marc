package JavaWhile;

public class WEx2 {


        public static void main(String[] args) {
            java.util.Scanner lector = new java.util.Scanner(System.in);
            System.out.print("Introdueix un número: ");
            int numero = lector.nextInt();
            int digitos = 0;

            if (numero < 0) {
                numero = -numero;
            }

            if (numero == 0) {
                digitos = 1;
            } else {
                while (numero > 0) {
                    digitos++;
                    numero = numero / 10;
                }
            }

            System.out.println("El número té " + digitos + " dígits");
        }
    }


