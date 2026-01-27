package taules;

public class Matrius {

    public static void main(String[] args) {
        final int N = 3;

        int[][] matriuA = {
            {1, 5, 2},
            {4, 1, 9},
            {0, 6, 3}
        };

        int[][] matriuB = {
            {3, 2, 7},
            {8, 4, 1},
            {5, 9, 2}
        };

        int[][] matriuSuma = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriuSuma[i][j] = matriuA[i][j] + matriuB[i][j];
                                                    
            }
        }

        System.out.println("Suma de dues matrius");

 for (int i = 0; i < N; i++) {
            imprimirFila(matriuA, i);
            
            if (i == N / 2) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }

            imprimirFila(matriuB, i);
            
            if (i == N / 2) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            
            imprimirFila(matriuSuma, i);
            
            System.out.println();
        }
        
        System.out.println("\n(Exemple: Posició [1][0]: 4 + 8 = 12)");
        
    }

    public static void imprimirFila(int[][] matriu, int fila) {
        System.out.print("|");
        for (int j = 0; j < matriu[fila].length; j++) {
            System.out.printf("%3d", matriu[fila][j]);
        }
        System.out.print(" |");
    }
}