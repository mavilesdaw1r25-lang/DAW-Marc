
package Resumen;

public class JefeFinal {
    public static void main(String[] args) {
        
        String[] datos = {"10", "20", "patata", "50", "hola", "5"};
        int sumaTotal = 0;
        
        System.out.println("--- INICIANDO CAJA ---");

        // 1. RECORRE LA TABLA (Usa un for normal o for-each)
        for (String texto : datos) {
            
            // 2. ZONA PELIGROSA: Intentamos convertir texto a numero
            try {
                int numero = Integer.parseInt(texto); 
                
                // Si llegamos aquí, es que es un número válido. ¡Súmalo!
                sumaTotal = sumaTotal + numero ;
                
                System.out.println("Procesado: " + numero);
            } 
            // 3. SI FALLA (NumberFormatException es el error de conversión)
            catch (NumberFormatException e) {
                System.out.println("BASURA ENCONTRADA: " + texto);
            }
        }
        
        System.out.println("-----------------------");
        System.out.println("TOTAL RECAUDADO: " + sumaTotal + "€");
    }
}