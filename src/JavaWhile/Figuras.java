
package JavaWhile;

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        
        int num, fila, col;
        
        System.out.print("De quin número vols fer el quadrat d'asteríscos?: ");
        num = scanner.nextInt();
        
        for (fila = 1; fila <= num; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        scanner.close();
    }
}