package EsructuraAlternativa;

import java.util.Scanner;

public class ExJavaBinario {

    public static void main(String[] args) {
        int valor, bits;
        Scanner lector = new Scanner(System.in);
        System.out.println("INtrodueix un valor entre 0 i 64: ");
        valor = lector.nextInt();
        if ((valor < 0) || (valor > 64)) {
            System.out.println("El valor no esta entre 0 i 64 : ");
        }else {
            if (valor < 2) {
            bits = 1;
            }else if (valor < 4) {
            bits = 2;
            }else if (valor < 8) {
            bits = 3;
            }else if (valor < 16) {
            bits = 4;
            }else if (valor < 32) {
            bits = 5;
            }else if (valor < 64) {
            bits = 6;
            }else {
            bits = 7;
            }
            System.out.println("Necessiem "+ bits + "bits");
            
    }
    }
}
