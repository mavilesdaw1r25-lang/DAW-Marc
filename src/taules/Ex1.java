
package taules;


public class Ex1 {
     public static void main (String[] args) {
        
       int taula1 [] = {-3, 5, 1, -4, 8, 20, -9, 2, 11, -1};
       int taula2 [] = {-3, 5, 1, -4, 8, 20, -9, 2, 11, -1};
       int taula3[] = new int [taula1.length];
       for (int i = 0; i < taula3.length; i++) {
           taula3[i] = taula1[i] + taula2[i];
       }
       for (int i = 0; i < taula3.length; i++) {
           System.out.println(taula3[1]+" ");
       }
     }
}
