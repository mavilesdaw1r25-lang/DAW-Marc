
package PracticaArrays;

import java.util.Arrays;
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Antes: " + Arrays.toString(numeros));
        for(int i = 0; i < numeros.length / 2; i++) {
            int espejo = numeros.length -1 -i;
            
            int aux = numeros[i];
            numeros[i] = numeros[espejo];
            numeros[espejo] = aux;
        }
        System.out.println("Despues: "+ Arrays.toString(numeros));
    }
    
}
