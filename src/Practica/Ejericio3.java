package Practica;

import java.util.*;

public class Ejericio3 {

    public static void main(String[] args) {

        List<String> listaCompra = new ArrayList<>();
        listaCompra.add("Leche");
        listaCompra.add("Pan");
        listaCompra.add("Huevos");
        listaCompra.add("Manzanas");
        listaCompra.add("Pan");

        System.out.println(listaCompra.size());
        listaCompra.remove(2);

        Iterator<String> it = listaCompra.iterator();
        
        while(it.hasNext()) {
            if(it.next().equals("Manzanas")){
                it.remove();
                
            }
        }
        listaCompra.removeIf(ad -> ad.equals("Manzanas"));
        

    }

}
