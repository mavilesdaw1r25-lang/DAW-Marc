package Practica;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> listaCompra = new ArrayList<>();
        listaCompra.add("Leche");
        listaCompra.add("Pan");
        listaCompra.add("Huevos");
        listaCompra.add("Manzanas");
        listaCompra.add("Pan");
        listaCompra.sort(
                new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(listaCompra);

    }
}
