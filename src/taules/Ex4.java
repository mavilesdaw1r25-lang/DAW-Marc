
package taules;


public class Ex4 {

    public static void main(String[] args) {
        // Taula de 10 enters (els valors de la taula representen la llargada de cada barra)
        int[] taulaValors = {2, 5, 1, 8, 3, 6, 4, 7, 10, 2};
        
        System.out.println("### DIAGRAMA DE BARRES ###\n");

        // Bucle exterior: Recorre cada element de la taula
        for (int i = 0; i < taulaValors.length; i++) {
            
            // 1. Mostrar la posició i el valor per claredat
            int valorBarra = taulaValors[i];
            System.out.printf("Element %2d (%2d): ", i, valorBarra);
            
            // 2. Bucle interior: Dibuixa la barra amb asteriscos
            // Aquest bucle s'executa exactament 'valorBarra' vegades
            for (int j = 0; j < valorBarra; j++) {
                System.out.print("*");
            }
            
            // 3. Salt de línia al final de cada barra
            System.out.println();
        }
    }
}

