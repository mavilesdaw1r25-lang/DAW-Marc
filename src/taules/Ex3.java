
package taules;

import java.util.Arrays;
public class Ex3 {
    
    
    public static void main (String [] args){
        int taulaEnters [] = {0,1,2,3,4,5,6,7,8,9};
        int inici = 0;
        int fi = taulaEnters.length -1;
        
        System.out.println("Taula Original: " + Arrays.toString(taulaEnters));
        
       while (inici < fi) {
           int temp = taulaEnters [inici];
           taulaEnters[inici] = taulaEnters[fi];
           
           taulaEnters[fi] = temp;
           
           inici++;
           fi--;
       } 
        System.out.println("Taula invertida: " + Arrays.toString(taulaEnters));
        
    }
}
