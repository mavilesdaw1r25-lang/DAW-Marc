import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("notesReales.txt ");
            String nombreArchivo = teclado.nextLine();
            
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);
            lector.useLocale(new Locale("es", "ES")); 
            
            int excelentes = 0, notables = 0, aprobados = 0, suspensos = 0;
            
            while (lector.hasNextDouble()) {
                double nota = lector.nextDouble();
                
                if (nota == -1) {
                    break; 
                }
                
                if (nota >= 9) excelentes++;
                else if (nota >= 6.5) notables++;
                else if (nota >= 5) aprobados++;
                else suspensos++;
            }
            lector.close();
            
            PrintWriter escritor = new PrintWriter("Histograma-" + nombreArchivo);
            escritor.println("Histograma del fitxer " + nombreArchivo);
            
            escritor.println("Suspès :");
            for (int i = 0; i < suspensos; i++) escritor.print("*");
            escritor.println(); 
            
            escritor.println("Aprovat:");
            for (int i = 0; i < aprobados; i++) escritor.print("*");
            escritor.println();
            
            escritor.println("Notable:");
            for (int i = 0; i < notables; i++) escritor.print("*");
            escritor.println();
            
            escritor.println("Excel·lent:");
            for (int i = 0; i < excelentes; i++) escritor.print("*");
            escritor.println();
            
            escritor.close();
            System.out.println("¡Archivo creado con éxito!");
            
        } catch (Exception error) {
            System.out.println("Ha ocurrido un problema: " + error.getMessage());
        }
    }
}