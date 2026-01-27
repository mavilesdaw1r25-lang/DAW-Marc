

package SOluciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class SistemaDeCompres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producte> carret = new ArrayList<>();

        boolean sortir = false;
        while (!sortir) {
            try {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Afegir producte al carret");
                System.out.println("2. Mostrar carret");
                System.out.println("3. Sortir");
                System.out.print("Selecciona una opció: ");
                int opcio = scanner.nextInt();
                scanner.nextLine(); // Netejar el buffer

                switch (opcio) {
                    case 1:
                        afegirProducte(carret, scanner);
                        break;
                    case 2:
                        mostrarCarret(carret);
                        break;
                    case 3:
                        sortir = true;
                        break;
                    default:
                        System.out.println("Opció no vàlida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no vàlida. Assegura't d'introduir números.");
                scanner.nextLine(); // Netejar el buffer
            } catch (Exception e) {
                System.out.println("Error inesperat: " + e.getMessage());
            } finally {
                System.out.println("Operació finalitzada.");
            }
        }

        scanner.close();
        System.out.println("Gràcies per utilitzar el sistema de compres!");
    }

    // Mètode per afegir un producte
    public static void afegirProducte(ArrayList<Producte> carret, Scanner scanner) {
        try {
            System.out.print("Introdueix el nom del producte: ");
            String nom = scanner.nextLine();

            System.out.print("Introdueix el preu del producte: ");
            double preu = scanner.nextDouble();

            System.out.print("Introdueix la quantitat: ");
            int quantitat = scanner.nextInt();

            Producte producte = new Producte(nom, preu, quantitat);
            carret.add(producte);

            System.out.println("Producte afegit correctament!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no vàlida. Assegura't d'introduir números.");
            scanner.nextLine(); // Netejar el buffer
        } catch (DadaInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        }
    }

    // Mètode per mostrar el carret
    public static void mostrarCarret(ArrayList<Producte> carret) {
        if (carret.isEmpty()) {
            System.out.println("El carret està buit.");
        } else {
            System.out.println("\nProductes al carret:");
            for (Producte producte : carret) {
                System.out.println(producte);
            }
        }
    }
}





