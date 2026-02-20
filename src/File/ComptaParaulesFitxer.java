package File;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class ComptaParaulesFitxer {

    public static void main(String[] args) {
        try (Scanner lector = new Scanner(new File("/home/maviles.daw1r25/Baixades/fistro.txt"))) {
            while (lector.hasNextLine()) {
                String linia[] = lector.nextLine().split(" ");
                for (String linial : linia) {
                    System.out.println(linial + " ");
                }
                System.out.println("");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

