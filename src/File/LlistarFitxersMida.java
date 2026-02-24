
package File;


import java.io.File;
import java.util.Scanner;

public class LlistarFitxersMida {

    public static final int KB = 1024;

    public static void main(String[] args) {
        LlistarFitxersMida programa = new LlistarFitxersMida();
        programa.inici();
    }

    public void inici() {
        File rutaCarpeta = llegirNomCarpeta();
        mostraFitxers(rutaCarpeta, 500);
    }
    public File llegirNomCarpeta() {
        //Un tipus compost es pot deixar sense inicialitzar posant "null"
        File f = null;
        boolean preguntar = true;
        Scanner lector = new Scanner(System.in);
        while (preguntar) {
            System.out.println("Escriu el nom d'una ruta a una carpeta: ");
            String nomCarpeta = lector.nextLine();
            f = new File(nomCarpeta);
            if (f.isDirectory()) {
                preguntar = false;
            } else {
                System.out.println("Aquesta carpeta no existeix...");
            }
        }
        return f;
    }

    /**
     * Mostra els fitxers dins una carpeta que tenen una mida mínima.
     *
     * @param f La ruta que cal processar.
     * @param mida La mida mínima dels fitxers a llistar (en Kb).
     */
    public void mostraFitxers(File f, int mida) {
        File[] elements = f.listFiles();
        System.out.println("Els fitxers de més de 500 Kb són:");
        for (File element : elements) {
            if (element.isFile()) {
                if (element.length() > 500 * KB) {
                    System.out.println(element.getName());
                }
            }
        }
    }
}
