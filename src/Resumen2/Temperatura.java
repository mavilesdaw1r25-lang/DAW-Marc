
package Resumen2;


public class Temperatura {
    public static void main(String[] args) {
        double[] temperaturas = {12.5, -3.0, 25.0, 18.2, -5.5, 30.0};
        double suma = 0;
        double maxima = temperaturas[0];
        int contadorHeladas = 0;
        for (int i = 0; i < temperaturas.length; i++){
          double actual = temperaturas[i]; // "actual" es la temperatura que estamos mirando AHORA
          
          suma += actual;
          
          if (actual > maxima)
              maxima = actual;
                 
          if (actual < 0)
              contadorHeladas++;
            
        }
        double media = suma  / temperaturas.length;
        System.out.println("Media"+ media);
        System.out.println("Maxima: "+ maxima);
        System.out.println("Dias de helada: "+ contadorHeladas);
        
    }
    
}
