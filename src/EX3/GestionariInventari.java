/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX3;

    import java.util.Scanner;
import java.util.InputMismatchException;

public class GestionariInventari {
    public static void main(String[] args) {
        // Dos inventarios separados como pide el enunciado [cite: 22]
        Inventari<Llibre> invLlibres = new Inventari<>();
        Inventari<Electrodomestic> invElectros = new Inventari<>();
        Scanner sc = new Scanner(System.in);
        int opcio = 0;

        do {
            try {
                System.out.println("\n--- MENÚ INVENTARI ---");
                System.out.println("1. Afegir llibre\n2. Afegir electrodomèstic\n3. Mostrar llibres\n4. Mostrar electrodomèstics\n5. Consultar per ID\n6. Eliminar per ID\n7. Sortir");
                System.out.print("Selecciona una opció: ");
                opcio = sc.nextInt(); // Pot llançar InputMismatchException [cite: 43]
                sc.nextLine(); // Netejar buffer

                switch (opcio) {
                    case 1:
                        System.out.print("ID: "); String idL = sc.nextLine();
                        System.out.print("Nom: "); String nomL = sc.nextLine();
                        System.out.print("Preu: "); double preuL = sc.nextDouble(); sc.nextLine();
                        System.out.print("Autor: "); String autor = sc.nextLine();
                        invLlibres.afegir(new Llibre(idL, nomL, preuL, autor));
                        break;
                    case 2:
                        System.out.print("ID: "); String idE = sc.nextLine();
                        System.out.print("Nom: "); String nomE = sc.nextLine();
                        System.out.print("Preu: "); double preuE = sc.nextDouble(); sc.nextLine();
                        System.out.print("Marca: "); String marca = sc.nextLine();
                        invElectros.afegir(new Electrodomestic(idE, nomE, preuE, marca));
                        break;
                    case 3: invLlibres.mostrarTots(); break;
                    case 4: invElectros.mostrarTots(); break;
                    case 5:
                        System.out.print("ID a consultar: "); String idC = sc.nextLine();
                        try {
                            System.out.println(invLlibres.consultar(idC));
                        } catch (IllegalArgumentException e) {
                            System.out.println(invElectros.consultar(idC));
                        }
                        break;
                    case 6:
                        System.out.print("ID a eliminar: "); String idDel = sc.nextLine();
                        try {
                            invLlibres.eliminar(idDel);
                            System.out.println("Eliminat de llibres.");
                        } catch (IllegalArgumentException e) {
                            invElectros.eliminar(idDel);
                            System.out.println("Eliminat d'electrodomèstics.");
                        }
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Has d'introduir un número.");
                sc.nextLine(); // Netejar buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Gestió d'errors de ID [cite: 41, 42]
            }
        } while (opcio != 7);
    }
}

