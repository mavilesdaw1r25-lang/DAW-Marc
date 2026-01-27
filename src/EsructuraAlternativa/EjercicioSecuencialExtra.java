
package EsructuraAlternativa;

public class EjercicioSecuencialExtra {
    public static void main(String[] args) {
       
        //INT = Entero  DOUBLE = Real //
        
       int Marta, Avi, Pare, Mare, Joan, Avia; 
               
        Marta =  10;
        Avi = 6 * Marta;
        Pare = 6 * (Avi / Marta);
        Joan = Pare % Marta;
        Mare = 3 * Marta + Joan;
        Avia = Pare + Mare - Marta;
        
        System.out.println("Marta "+ Marta + " anys ");
        System.out.println("Joan: " + Joan + " anys ");
        System.out.println("Mare : " + Mare + " anys ");
        System.out.println("Pare: " + Pare + " anys ");
        System.out.println("Avia: " + Avia + " anys ");
        System.out.println("Avi: " + Avi + " anys ");
        
        
        
        
    }
}
