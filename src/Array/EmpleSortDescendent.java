package Array;

import java.util.Arrays;
import java.util.Comparator;

public class EmpleSortDescendent {

    public static void main(String[] args) {
        String taula[] = {"pantalons", "ribagorça", "campechano"};
        //Orden
        Arrays.sort(taula);
        System.out.println("Ascendent:");
        System.out.println(Arrays.toString(taula));

        System.out.println("Descendent");
        Arrays.sort(taula, Comparator.reverseOrder());

        System.out.println(Arrays.toString(taula));

    }
}