package Practica;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        double[] temperatura = new double[7];
        temperatura[0] = 20.0;
        temperatura[1] = 13.4;
        temperatura[2] = 15.4;
        temperatura[3] = 34.8;
        temperatura[4] = 20.6;
        temperatura[5] = 14.6;
        temperatura[6] = 32.6;
     
        Arrays.sort(temperatura);
        System.out.println(Arrays.toString(temperatura));
       
    }
}
