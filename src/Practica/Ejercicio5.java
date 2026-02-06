package Practica;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 5, 10, 20, 3, 8, 10);

        numeros.stream()
                .filter(p ->p >= 5)
                .mapToInt(p -> p*2)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
                
        
                
                
    }
}
