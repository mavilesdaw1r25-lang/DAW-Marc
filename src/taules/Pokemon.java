
package taules;
import java.util.Random;
import java.util.Arrays;

public class Pokemon {
    public static void main (String [] args ){
  final int MAX_POKEMONS = 10;
        Random r = new Random();
        
        int[] forcaE1 = new int[MAX_POKEMONS];
        int[] forcaE2 = new int[MAX_POKEMONS];
        
        int puntsE1 = 0;
        int puntsE2 = 0;
        
        for (int i = 0; i < MAX_POKEMONS; i++) {
            forcaE1[i] = r.nextInt(100) + 1;
            forcaE2[i] = r.nextInt(100) + 1;
        }        
                
    }
    
}
