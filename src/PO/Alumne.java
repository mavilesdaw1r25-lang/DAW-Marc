
package PO;

public class Alumne {
    String nom;
    int edat;
    double notaFinal;
    
    public void posarNotaFinal(double nota){
    
      notaFinal=nota;
      

    }
    public double consultaNotaFinal(){
        return notaFinal;
    }
}
                