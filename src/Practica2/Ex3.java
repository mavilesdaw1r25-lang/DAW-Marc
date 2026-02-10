
package Practica2;

import java.util.Map;
import java.util.HashMap;



public class Ex3 {
    
    public static void main(String[] args) {
     
        Map<String, Double> productos = new HashMap<>();
        productos.put("Leche", 1.20);
       productos.put("Pan",0.80);
       productos.put("Arroz",1.50);
      
       
        System.out.println("Productos insiciales: " + productos);
        
        
        productos.put("Leche",2.50);
   productos.putIfAbsent("Pan", 50.0);
        
        System.out.println("Mapa modificado" + productos);
        System.out.println("\n---- TICKET FINAL ----");
        for (Map.Entry<String, Double> entrada : productos.entrySet()) {
           System.out.println("Producto: " + entrada.getKey() + " - " + entrada.getValue() + "€");
        }
    }
    
}
