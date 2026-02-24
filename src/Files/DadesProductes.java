import java.io.PrintWriter;

public class DadesProductes {
    public static void main(String[] args) {
        
        // ¡OJO! Pon aquí tu lista entera de productos
        String[] productos = {
            "4LIFE TRANSFER FACTOR PLUS 90 TBS", 
            "AB SOLUTION PLUS 240ml",
            "ABRASONE RECTAL crema 30 gr." 
        };

        int[][] ventas = {
            {290, 316, 877, 924}, 
            {339, 874, 158, 359}, 
            {485, 754, 80, 38}
        };

        try {
            PrintWriter escritor = new PrintWriter("vendes.txt");
            
            escritor.println("\"Producte\",\"1 Trim\",\"2 Trim\",\"3 Trim\",\"4 Trim\"");
            
            for (int i = 0; i < productos.length; i++) {
                
                String lineaDeVenta = "\"" + productos[i] + "\",\"" + 
                                      ventas[i][0] + "\",\"" + 
                                      ventas[i][1] + "\",\"" + 
                                      ventas[i][2] + "\",\"" + 
                                      ventas[i][3] + "\"";
                
                escritor.println(lineaDeVenta);
            }
            
            escritor.close();
            System.out.println("El archivo vendes.txt se ha creado de forma simple y correcta.");
            
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}