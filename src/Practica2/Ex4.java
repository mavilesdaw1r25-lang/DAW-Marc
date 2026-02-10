
package Practica2;
import java.util.*;


public class Ex4 {
    
  static class Alumno{
      String nombre;
      double nota;
      
      public Alumno(String n, double s) {
          nombre = n;
          nota = s;
      }
      public double getNota() { return nota;}
      
     public String toString() { return nombre + "(" + nota + ")"; }
     
      }
     
    public static void main(String[] args) {
        List<Alumno> clase = Arrays.asList(
       new Alumno("Ana", 4.5),
            new Alumno("Luis", 9.0),
            new Alumno("Eva", 5.0),
            new Alumno("Pep", 2.0)
        );       
    }
    }

