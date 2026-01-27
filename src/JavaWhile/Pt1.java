import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la mida (n): ");
        int n = scanner.nextInt();
        System.out.print("Introduce el nivel: ");
        int level = scanner.nextInt();

        int anchoDiamante = 2 * n - 1; // Ancho total de un diamante
        int alturaDiamante = 2 * n - 1; // Altura total
        int separacion = 3; // Separación fija entre diamantes

        for (int l = 1; l <= level; l++) {
            if (l > 1) {
                System.out.println(); // Línea en blanco entre niveles
            }

            // CÁLCULO: número de diamantes = 2^(l-1)
            int numDiamantes = 1 << (l - 1);  // 1, 2, 4, 8, ...

            // Dibujar cada línea del nivel
            for (int linea = 0; linea < alturaDiamante; linea++) {
                for (int d = 1; d <= numDiamantes; d++) {
                    // Separación entre diamantes
                    if (d > 1) {
                        for (int s = 0; s < separacion; s++) {
                            System.out.print(" ");
                        }
                    }

                    // Calcular la fila actual del diamante
                    int i = (linea < n) ? (linea + 1) : (alturaDiamante - linea);

                    // Espacios a la izquierda
                    int espaciosIzq = n - i;
                    for (int j = 0; j < espaciosIzq; j++) {
                        System.out.print(" ");
                    }

                    // Dibujar el borde del diamante (solo extremos)
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        if (j == 1 || j == 2 * i - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    // Espacios a la derecha
                    int espaciosDer = anchoDiamante - (espaciosIzq + (2 * i - 1));
                    for (int j = 0; j < espaciosDer; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Salto de línea
            }
        }
        scanner.close();
    }
}