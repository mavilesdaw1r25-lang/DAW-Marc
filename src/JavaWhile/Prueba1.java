import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la mida : ");
        int n = scanner.nextInt();
        System.out.print("Introduce el nivel: ");
        int level = scanner.nextInt();
        
        for (int l = 1; l <= level; l++) { // Loop for each row (1 to level diamonds per row)
            // Print 'l' diamonds in the current row
            for (int d = 1; d <= l; d++) { // Loop to print 'l' diamonds horizontally
                if (d > 1) {
                    System.out.print("   "); // 3 spaces between diamonds
                }
                
                // Upper triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        if (j == 1 || j == 2 * i - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // Newline after each line of the diamond
                }
                
                // Lower triangle
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        if (j == 1 || j == 2 * i - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // Newline after each line of the diamond
                }
            }
            System.out.println(); // Blank line between rows
        }
        
        scanner.close();
    }
}