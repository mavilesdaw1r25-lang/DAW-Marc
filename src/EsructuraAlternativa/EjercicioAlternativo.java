
package EsructuraAlternativa;
import java.util.Scanner;
public class EjercicioAlternativo {
    public static void main(String[] args) {
        
     final int DIA = 4;
     final int DIAFESTIU = 6;
     final int NIT = 6;
     final int NITFESTIU = 9;
     
      Scanner lector = new Scanner (System.in);
      
      int hores, salari;
      char torn, dia;
      
        System.out.println("Introduce el numero de hores treballades: ");
        hores= lector.nextInt();
        
        System.out.println("Intodueix el tonr D/N: ");
        torn= lector.next().charAt(0);
        
        System.out.println("Introdueix el dia D/F: ");
        dia= lector.next().charAt(0);
        
        if ( dia== 'f'){
            if(torn=='d'){
                salari=hores* DIA;
            }
            else{
                salari=hores* NIT;
            }
        }else if (torn == 'd') {
            salari = hores * DIAFESTIU;
          
        }else {
            salari = hores * NITFESTIU;
        }
        System.out.println("El salari es: " + salari);
    }
}

