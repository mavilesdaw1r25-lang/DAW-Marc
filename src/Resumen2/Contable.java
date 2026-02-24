import java.util.*; // Importamos el Mapa

public class Contable {
    public static void main(String[] args) {
        
        // 1. INPUT (Datos sucios)
        String[] datos = {"España:100", "Francia:Error", "España:50", "Italia:20", "Alemania:Nulo"};

        // 2. EL MAPA (La caja clasificadora)
        Map<String, Integer> ventas = new HashMap<>();

        // 3. EL BUCLE FOR-EACH (Recorrer línea a línea)
        for (String linea : datos) {
            
            // A. Cortar (Split)
            String[] partes = linea.split(":");
            String pais = partes[0];
            String dineroTexto = partes[1];

            // B. Intentar convertir (Try-Catch)
            try {
                // Si esto falla (es "Error"), salta al catch
                int dinero = Integer.parseInt(dineroTexto);

                // C. Acumular en el mapa
                // (Recupera lo antiguo, suma lo nuevo, y guarda)
                ventas.put(pais, ventas.getOrDefault(pais, 0) + dinero);

            } catch (Exception e) {
                // Si falla, no hacemos NADA. Simplemente pasamos a la siguiente línea.
                System.out.println("Dato ignorado: " + linea);
            }
        }

        // 4. VER RESULTADO
        System.out.println("Ventas finales: " + ventas);
    }
}