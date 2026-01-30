
package Array;

import java.util.Arrays;

public class ExempleSortSubarray {
    public static void main(String[] args) {
        
        int[] taula = {13, 7, 6, 45, 21, 9, 2, 100};
        //Ordena de la 1 a la 4
        Arrays.sort(taula, 1, 5);
        
        System.out.println(Arrays.toString(taula));
    }
    
}
