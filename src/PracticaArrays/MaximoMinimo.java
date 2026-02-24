
package PracticaArrays;


public class MaximoMinimo {
    public static void main(String[] args) {
        //Aqui creo la lista de numeros: 
        int[] numeros = {15, -4, 20, 8, 35, -10, 2, 0, 11, 5};
        int max= numeros[0];
        int min = numeros[0];
        //Recorro la lista con For :
        for (int i = 1; i < numeros.length; i++){
            int numeroActual = numeros[i];
            //Aqui "asigno" el numero mayor y menor 
            if (numeroActual > max){
                max = numeros[i];
            }
            if (numeroActual < min){
                min = numeros[i];
            }
        }
            System.out.println("El maximo es: " + max);
            System.out.println("El minimo es:" + min);
       
        }
        
    }
    

