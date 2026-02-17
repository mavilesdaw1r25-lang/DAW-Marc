/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resumen;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        
        List<String> nombres = Arrays.asList("ana", "pepe", "luis", "maria");
        
        System.out.println("--- NOMBRES EN MAYÚSCULAS ---");

        nombres.stream()
               // TRANSFORMA EL DATO
               // Entra "ana" -> Sale "ANA"
               .map( nombre -> nombre.toUpperCase()) 
               
               // IMPRIME EL RESULTADO
               .forEach( nombre -> System.out.println(nombre) );
    }
}