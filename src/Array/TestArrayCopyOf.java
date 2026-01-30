package Array;

import java.util.Arrays;

public class TestArrayCopyOf {

    public static void main(String[] args) {

        int original[] = {10, 20, 15, 22, 35};
        System.out.println("Taula original");
        System.out.println(Arrays.toString(original));

        System.out.println("\nNova taula amb la mateix mida: ");
        int copiaIgual[] = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copiaIgual));

        System.out.println("\nNova taula ampliada:");
        int copiaGran[] = Arrays.copyOf(original, 10);
        System.out.println(Arrays.toString(copiaGran));

        System.out.println("\nNova taula reduida:");
        int copiaMenor[] = Arrays.copyOf(original, 3);
        System.out.println(Arrays.toString(copiaMenor));
    }

}
