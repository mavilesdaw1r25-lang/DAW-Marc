
package EsructuraAlternativa;

import java.util.Scanner;


public class JavaM {
    public static void main(String[] args) {
   
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introdueix l'any per calcular la Pasqua: ");
            int any = scanner.nextInt();
            
            int a = any % 19;
            int b = any % 4;
            int c = any % 7;
            int d = (19 * a + 24) % 30;
            int e = (2 * b + 4 * c + 6 * d + 5) % 7;
            
            
            int dia;
            String mes;
            
            if (d + e < 10) {
                dia = 22 + d + e;
                mes = "març";
            } else {
                dia = d + e - 9;
                mes = "abril";
            }
            
            System.out.println("El Diumenge de Pasqua de l'any " + any + " és el " + dia + " d'" + mes + ".");
        }
    }
}
        
    

