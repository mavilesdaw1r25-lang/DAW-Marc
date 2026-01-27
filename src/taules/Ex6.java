
package taules;

        import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        final int MAX_ALUMNES = 30;
        
        double[] notes = new double[MAX_ALUMNES];
        
        Scanner scanner = new Scanner(System.in);
        
        double nota = 0; 
        int numAlumnes = 0; 
        double sumaNotes = 0; 
        
        System.out.println("--- CÀLCUL DE LA NOTA MITJANA DEL GRUP ---");
        System.out.println("Introdueix les notes (entre 0 i 10). Per finalitzar, introdueix -1.");
        System.out.println("------------------------------------------");
        
        while (numAlumnes < MAX_ALUMNES) {
            
            System.out.print("Introdueix nota de l'alumne " + (numAlumnes + 1) + ": ");
            
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
            } else {
                System.out.println("Error: Si us plau, introdueix un número.");
                scanner.next(); 
                continue;
            }
            
            if (nota == -1) {
                break; 
            }
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota no vàlida. Introdueix un valor entre 0 i 10, o -1 per finalitzar.");
                continue; 
            }
            
            notes[numAlumnes] = nota;
            
            sumaNotes += nota;
            numAlumnes++;
        }
        
        scanner.close(); 
        
        System.out.println("\n----------------- RESULTAT -----------------");

        if (numAlumnes == 0) {
            System.out.println("No s'han introduït notes vàlides. La mitjana no es pot calcular.");
        } else {
            double mitjana = sumaNotes / numAlumnes;
            
            System.out.println("Total d'alumnes amb nota: " + numAlumnes);
            System.out.println("Suma total de notes: " + String.format("%.2f", sumaNotes));
            System.out.println("La NOTA MITJANA del grup és: " + String.format("%.2f", mitjana));
        }
    }
}
    

