package Resumen;

import java.util.HashMap;
import java.util.Map;

public class Segunda {

    public static void main(String[] args) {

        // 1. CREA EL MAPA (Se suele llamar 'precios' o 'menu')
        Map<String, Double> menu = new HashMap<>();

        // 2. AÑADE LOS 3 PRODUCTOS (put)
        menu.put("Cafe", 1.20);
        menu.put("Croissant", 1.50);
        menu.put("Zumo", 2.00);

        // 3. MODIFICA EL PRECIO DEL CAFÉ (put otra vez con el mismo nombre)
        menu.put("Cafe", 1.30);
        // 4. RECUPERA E IMPRIME EL PRECIO DEL CAFÉ 
        menu.get("Cafe");
        // System.out.println(...);
       System.out.println( "Precio del café: " + menu.get("Cafe") );
       
       System.out.println("\n--- TICKET DE COMPRA ---");
        
        // "par" es una variable que guarda la Pareja (Nombre + Precio)
        for (Map.Entry<String, Double> par : menu.entrySet()) {
            
            String producto = par.getKey(); // Saca la Clave (Nombre)
            Double precio = par.getValue();   // Saca el Valor (Precio)
            
            System.out.println("Producto: " + producto + " | Precio: " + precio + "€");
        }
    }
}
