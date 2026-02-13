
package P;

import java.io.File;

public class P1 {
    public static void main(String[] args) {
        File Temp = new File(System.getProperty(""));
        
        if(Temp.exists()) {
            System.out.println("Borrar");
            
        }else {
            
            System.out.println("Creado");
            
        }
    }
}
