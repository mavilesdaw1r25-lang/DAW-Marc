
package Resumen;

import java.util.Arrays;
import java.util.List;

public class EjercicioFInalStreams {
    public static void main(String[] args) {
        List<Integer> precios = Arrays.asList(10, 20, 5, 30, 2);
        
        System.out.println("--- PRECIOS FINALISTAS ---");

        precios.stream()
               // 1. PRIMERO FILTRA: Solo los mayores (>) de 10
               .filter( p -> p > 10 )
               
               // 2. LUEGO TRANSFORMA: Súmale 5 a lo que haya pasado
               .map( p -> p + 5 )
               
               // 3. IMPRIME
               .forEach( p -> System.out.println(p) );
    }
}