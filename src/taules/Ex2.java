
package taules;

public class Ex2 {

public static void main (String []args) {
int taulaNumeros [] =  {45, 23,12,34,123,23,12};

int minim = taulaNumeros[0];
int maxim = taulaNumeros[0];

    System.out.println("taula");
    
    for (int i = 1; 1 < taulaNumeros.length; i++) {
        int valorActual = taulaNumeros[i];
        
        System.out.println("Posicio"+ i + ": "+ valorActual);
        if (valorActual > maxim) {
            maxim = valorActual;
        }
        if (valorActual < minim) {
            minim = valorActual;
        }
    }
    System.out.println("/n-");
    System.out.println("Finalizacion del bucle");
    System.out.println("El valor mes petit (minim) de la taula es:" + minim);
     System.out.println("El valor mes gran (maxim) de la taula es:" + maxim);
}


}
