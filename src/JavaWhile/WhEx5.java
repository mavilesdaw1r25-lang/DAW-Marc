
package JavaWhile;



public class WhEx5 {
    public static void main(String[] args) {
            java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int numero = lector.nextInt();
        int suma = 0;

        if (numero < 0) {
            numero = -numero;
        }

        if (numero == 0) {
            suma = 0;
        } else {
            while (numero > 0) {
                int digito = numero % 10;
                suma = suma + digito;
                numero = numero / 10;
            }
        }

        System.out.println("La suma de les xifres és: " + suma);
    }
}
    
    
