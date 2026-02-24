package PracticaArrays;
import java.util.Arrays;

public class Ejercicio1Taules {

    public static void main(String[] args) {
        //Dos tablas inciales (msima longitud)

        int[] taula1 = {-3, 5, 1, -4, 8, 20, -9, 2, 11, 1};
        int[] taula2 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        //Creamos la tertcera tabla vacia pero con el mismo tamaño
        int[] taula3 = new int[10];

        //Bucle recorre desde la casilla 0 hasta la 9
        for (int i = 0; i < taula1.length; i++) {
            taula3[i] = taula1[i] + taula2[i];

        }
        System.out.println("Resultado: " + Arrays.toString(taula3));
    }
}
