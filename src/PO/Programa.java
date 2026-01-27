
package PO;

public class Programa {
    
    public static void main(String[] args) {
        Alumne alumne1=new Alumne();
        Alumne alumne2=new Alumne();
        alumne1.nom="Pepe";
        alumne1.posarNotaFinal(7.8);
        System.out.println("L'alumne "+ alumne1.nom);
        
    }
}
