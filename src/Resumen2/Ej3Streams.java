/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resumen2;

import java.util.Arrays;
import java.util.List;

public class Ej3Streams {

    public static void main(String[] args) {

        List<Double> sueldos = Arrays.asList(1200.0, 3000.0, 900.0, 1800.0);

        System.out.println("--- NUEVOS SUELDOS (Subida del 10%) ---");

        sueldos.stream()
                .filter(s -> s < 150)
                .map(s -> s * 1.10)
                .forEach(s -> System.out.println("Sueldo ajustado: " + s + "€"));
    }
}
