
package taules;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {
        
        int[] taulaA = {10, 5, 20, 15, 30, 25, 40, 1, 8};
        int[] taulaB = {25, 12, 10, 3, 40, 50, 15, 9, 7};
        
        System.out.println("Taula A: " + Arrays.toString(taulaA));
        System.out.println("Taula B: " + Arrays.toString(taulaB));
        System.out.println("------------------------------------------");
        System.out.println("Valors repetits (comuns):");

        for (int elementA : taulaA) {
            for (int elementB : taulaB) {
                if (elementA == elementB) {
                    System.out.println("- " + elementA);
                    break; 
                }
            }
        }
    }
}


