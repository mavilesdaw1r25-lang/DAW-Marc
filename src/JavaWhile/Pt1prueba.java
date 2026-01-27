import java.util.Scanner;

public class Pt1prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño (n): ");
        int n = sc.nextInt();
        System.out.print("Niveles: ");
        int maxNivel = sc.nextInt();

        int altura = 2 * n - 1;
        int cantidad = 1;  

        for (int nivel = 1; nivel <= maxNivel; nivel++) {

            for (int linea = 0; linea < altura; linea++) {
                int fila = (linea < n) ? linea + 1 : altura - linea;

                for (int d = 1; d <= cantidad; d++) {
                    if (d > 1) System.out.print("   ");

                    for (int esp = 0; esp < n - fila; esp++) System.out.print(" ");
                    System.out.print("*");
                    for (int m = 1; m < 2 * fila - 1; m++) System.out.print(" ");
                    if (fila > 1) System.out.print("*");
                    for (int esp = 0; esp < n - fila; esp++) System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();

            cantidad = cantidad * 2;  
        }
        sc.close();
    }
}