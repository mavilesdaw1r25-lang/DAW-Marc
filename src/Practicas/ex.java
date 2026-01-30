
package Practicas;
  interface Operacio {
double calcular(double a, double b);
  }
public class ex{
  public static void main(String[] args) {
    
      Operacio suma = new Operacio() {
          @Override
          public double calcular (double a, double b){
              return a + b;
          }
      };
              Operacio resta = new Operacio() {
                  @Override
                  public double calcular (double a, double b){
                      return a - b;
                  }
              };
              
              Operacio Multiplicacio = new Operacio() {
                  @Override 
                  public double calcular (double a, double b){
                      return a * b;
                  }
              };
              
              Operacio Divisió = new Operacio() {
                  @Override 
                  public double calcular (double a, double b) {
                      if (b == 0){
                          throw new ArithmeticException("No es pot dividir per zero.");   
                      }
                      return a / b ;                   
                  }
              };
              // PROVES
              System.out.println("Suma: "+ suma.calcular(10, 5));
              System.out.println("Resta: "+ resta.calcular(10, 5));
              System.out.println("Multiplicació: "+ Multiplicacio.calcular(10, 5));
              System.out.println("Divisió: "+ Divisió.calcular(10, 5));
              
              
              
              
    
    
            }   
}
