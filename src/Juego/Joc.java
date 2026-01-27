package Juego;

public abstract class Joc {

    private static int record = 0;

    private int vides;
    private final int videsInicials;

    public Joc(int videsInicials) {
        if (videsInicials > 10) {
            this.videsInicials = 10;
        } else if (videsInicials < 1) {
            this.videsInicials = 1;
        } else {
            this.videsInicials = videsInicials;
        }
        this.vides = this.videsInicials;
    }
    
    public void mostraVidesRestants() {
        System.out.println("Vides restants: "+ vides);
               
    }
    
    public boolean treuVida() {
      if (vides > 0) {
          vides--;
      }  
      return vides > 0;
      
      
    }
    
    

}
