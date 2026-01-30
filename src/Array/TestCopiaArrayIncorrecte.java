
package Array;

public class TestCopiaArrayIncorrecte {
     public static void main(String[] args) {
        int a[] = {1, 8, 3};
        int b[] = new int [a.length];
        b= a;
        b[0]++;
         System.out.println("Contingut d'a[]: ");
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i] + " ");
         }
         System.out.println("\nContingut de b[]: ");
         for (int i = 0; i < b.length; i++) {
             System.out.println(b[i] + " ");
             
         }
         System.out.println(" ");
    }
    
}
