import java.util.HashMap;
import java.util.Map;

public class ExamenFinalPro {
    public static void main(String[] args) {
        
        String[] productos = {"Manzana", "Pera", "Manzana", "Uva", "Manzana", "Pera"};
        String[] cantidades = {"10",     "5",    "20",      "Error", "cinco",   "10"};
        
        Map<String, Integer> inventario = new HashMap<>();
        
        System.out.println("--- PROCESANDO INVENTARIO ---");

        for (int i = 0; i < productos.length; i++) {
            
            String nombre = productos[i];
            
            // HUECO 1: Zona peligrosa (Convertir)
            try {
                int cantidad = Integer.parseInt(cantidades[i]); 
                
                // Lógica de acumulador:
                if (inventario.containsKey(nombre)) {
                    
                    // CASO A: Ya existe. Rescatamos y sumamos.
                    int anterior = inventario.get(nombre);  // HUECO 2: Recuperar
                    inventario.put(nombre, anterior + cantidad); // HUECO 3: Guardar suma
                    
                } else {
                    // CASO B: Es nuevo. Guardamos directo.
                    inventario.put(nombre, cantidad);
                }
                
                System.out.println("✅ Procesado: " + nombre + " (+ " + cantidad + ")");

            } catch (NumberFormatException e) { // HUECO 4: El error
                System.out.println("❌ Dato corrupto ignorado en posición " + i);
            }
        }
        
        System.out.println("-----------------------------");
        System.out.println("INVENTARIO FINAL: " + inventario);
    }
}