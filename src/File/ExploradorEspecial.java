/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class ExploradorEspecial {
      public static void main(String[] args) {
        Commutador programa = new Commutador();
        programa.inici();
    }

    public void inici() {
        File f = new File("Temp");
        if (f.isDirectory()) {
            boolean ok = f.delete();
            if (ok) {
                
                 System.out.println("S'ha esborrat la carpeta " + f.getAbsolutePath());
            } else {
               System.out.println("Error esborrant la carpeta " + f.getAbsolutePath());
            }
        } else {
            boolean ok = f.mkdir();
            if (ok) {
                 System.out.println("S'ha creat la carpeta " + f.getAbsolutePath());
               
            } else {
                 System.out.println("Error creant la carpeta " + f.getAbsolutePath());
                
            }
        }

    }
}


