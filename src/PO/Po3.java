
package PO;

import java.util.Scanner;


public class Po3 {
    
    public static int sumar(String missatge) {
        Scanner teclat = new Scanner(System.in);
        System.out.println(missatge);
        return teclat.nextInt();
    }
    
public static int suma (int a, int b) {
    return a + b;
}

    public static void main(String[] args) {
        int x = sumar("Introduce el primer numero:" );
        int y = sumar("Introduce el segundo numero:" );
        int d = sumar("Introduce la operacion -,/,+,*: ");
        
        System.out.println("Resultado " +suma (x, y));
    }
}