import java.io.File;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            File archivo = new File("fistro.txt");
            Scanner lector = new Scanner(archivo);
            
            int numeroLinea = 1;
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                
                if (linea.equals("fi")) {
                    break; 
                }
                
                String[] palabras = linea.split(" ");
                
                System.out.println("La línia " + numeroLinea + " té " + palabras.length + " paraules.");
                numeroLinea++;
            }
            
            lector.close(); 
            
        } catch (Exception error) {
            System.out.println("Error al abrir el archivo: " + error.getMessage());
        }
    }
}