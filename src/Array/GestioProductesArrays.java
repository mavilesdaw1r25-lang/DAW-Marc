
package Array;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class GestioProductesArrays {

    // Comparadors reutilitzables
    private static final Comparator<Producte> PER_PREU_ASC
            = Comparator.comparingInt(Producte::getPreu);

    private static final Comparator<Producte> PER_PREU_DESC
            = Comparator.comparingInt((Producte p) -> p.getPreu()).reversed();

    private static final Comparator<Producte> PER_PREU_I_NOM
            = Comparator.comparingInt((Producte p) -> p.getPreu())
                    .thenComparing(p -> p.getNom());

    public static void main(String[] args) {
Producte[] productes = {
    new Producte("Ratoli", 15),
    new Producte("Teclat", 25),
    new Producte("Pantalla", 150),
    new Producte("Altaveus", 25),
    new Producte("Càmera", 80),
    new Producte("USB", 15)
};

Producte[] copiaInicial = Arrays.copyOf(productes, productes.length);

Scanner lector = new Scanner(System.in);
int opcio = -1;

while (opcio !=0) {
    mostrarMenu();
    opcio = llegirEnter(lector, "Opció: ");
    
    switch (opcio) {
        case 1 -> 
            mostrar(productes);
            
        case 2 ->{
            Arrays.sort(productes, PER_PREU_ASC);
            System.out.println("Ordenat per preu ascendent. ");
        }
        
        case 3 ->{
            Arrays.sort(productes, PER_PREU_DESC);
            System.out.println("Ordenat per preu descendent. ");
        }
        
        case 4 ->{
            Arrays.sort(productes, PER_PREU_I_NOM);
            System.out.println("Ordenat per preu i nom. ");
        }
        
        case 5 ->{
            int n = llegirEnter(lector, "Quants elements incials vols "
                    + "copiar? ");
            if (n < 0) {
                n = 0;
            }
            if (n > productes.length) {
                n = productes.length;
            }
            
            Producte[] copia = Arrays.copyOf(productes, n);
            System.out.println("Copia del " + n + " primers:");
            mostrar(copia);
            
        }
        
        case 6 ->{
            int inici = llegirEnter(lector, "index inici (inclòs): ");
            int fi  = llegirEnter(lector,"index fi (exclos:)");
            
            if (inici < 0) {
                inici = 0;
            }
            if (fi > productes.length) {
                fi = productes.length;
            }
            
            if (inici >= fi) {
                System.out.println("Rang incorrecte.");
            }else {
                Producte[] sub = Arrays.copyOfRange(producte, inici, fi);
               System.out.println("Subarray [" + inici + "," + fi + "):");
               mostrar(sub);
            }
        }
       case 7 -> {
                    boolean iguals = Arrays.equals(productes, copiaInicial);
                    System.out.println(iguals ? "L'array és IGUAL a la còpia inicial."
                            : "L'array NO és igual a la còpia inicial.");
                    System.out.println("Nota: en arrays d'objectes, equals compara referències.");
                }
       
      case 8 -> {
                    Producte buit = new Producte("BUIT", 0);
                    Arrays.fill(productes, buit);
                    System.out.println("Array omplert amb BUIT (0€).");
                    mostrar(productes);
                }
       case 9 -> {
                    // Manté els noms originals i assigna preus segons l'índex: 10, 20, 30...

                    Arrays.setAll(productes, i -> new Producte(productes[i].getNom(), (i + 1) * 10));
                    System.out.println("Array regenerat amb setAll.");
                    mostrar(productes);
                }
         case 10 -> {
                    int preuBuscat = llegirEnter(lector, "Preu a cercar: ");

                    // La cerca binària requereix que l'array estigui ordenat pel mateix criteri
                    Arrays.sort(productes, PER_PREU_ASC);
                    // el nom no importa perquè comparem per preu
                    int pos = Arrays.binarySearch(productes, new Producte("X", preuBuscat), PER_PREU_ASC);

                    if (pos >= 0) {
                        System.out.println("Trobat a la posició " + pos + ": " + productes[pos]);
                    } else {
                        int puntInsercio = -(pos + 1);
                        System.out.println("No trobat. Punt d'inserció: " + puntInsercio);
                    }
                }
          case 0 ->
                    System.out.println("Sortint...");

                default ->
                    System.out.println("Opció no vàlida.");
            }
         
           }
          
        }
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRODUCTES (Arrays)---");
        System.out.println("1. Mostrar productes");
        System.out.println("2. Ordenar per preu ascendent");
        System.out.println("3. Ordenar per preu descendent");
        System.out.println("4. Ordenar per preu i nom");
        System.out.println("5. Copiar N primers (copyOf)");
        System.out.println("6. Copiar un rang [inici, fi) (copyOfRange)");
        System.out.println("7. Comparar amb còpia inicial (equals)");
        System.out.println("8. Omplir amb BUIT (fill)");
        System.out.println("9. Regenerar array amb setAli");
        System.out.println("10. Cercar per reu (binary)");
    }
    }

                        
    

