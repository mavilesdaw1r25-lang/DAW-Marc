package FIles3;

import java.util.*;
import java.io.*;

public class ResultatsAleatorios {

    public static void main(String[] args) {
        String[] equips = {"Barça", "Madrid", "Sevilla", "València", "Betis"};
        
        // 1. Generamos el archivo de resultados
        escriureResultatsAleatoris(equips);
        
        // 2. Aquí llamarás al método de leer (cuando lo escribas abajo)
        // Map<String, Integer> clasificacion = llegirResultatsICalcularClassificacio();
        
        // 3. Aquí llamarás al método de volcar al archivo
        // escriureClassificacio(clasificacion);
    }

    public static void escriureResultatsAleatoris(String[] LlistaEquips) {
        Random random = new Random();
        try {
            PrintWriter escritor = new PrintWriter("resultats.txt");
            for (int i = 0; i < LlistaEquips.length; i++) {
                for (int j = i + 1; j < LlistaEquips.length; j++) {

                    int gols1 = random.nextInt(6);
                    int gols2 = random.nextInt(6);

                    String resultat = LlistaEquips[i] + " " + LlistaEquips[j] + " " + gols1 + " " + gols2;

                    escritor.println(resultat);
                }
            }
            escritor.close();
            System.out.println("Fitxer 'resultats.txt' creado correctament");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Map<String, Integer> llegirResultatsICalcularClassificacio() {
        Map<String, Integer> classificacio = new HashMap<>();
        try{
            File fitxer = new File("resultats.txt");
        Scanner lector = new Scanner(fitxer);
        
        while(lector.hasNextLine())
        String linea = lector.nextLine();
        String partes[] = linea.split("");
       
        String eq1 = partes[0];
        String eq2 = partes[1];
        int g1 = integer.parseInt(partes[2]);
        int g2 = integer.parseInt(partes[3]);
        
        //    - line.split(" ") para obtener un array de 4 Strings
        //    - putIfAbsent para inicializar los equipos a 0
        clasificacio.putIfAbsent(eq1,0);
        clasificacio.putIfAbsent(eq2,0);
        
        if(g1 < eq2){
            
        }
        //    - Convertir los goles a int (Integer.parseInt)
        //    - Comparar goles y sumar puntos (3, 1 o 0) al Map
        
        return classificacio; 
    
        } catch (FileNotFoundException e) {
    System.out.println("No se ha encontrado el archivo");
        }

    // --- HUECO PARA EL MÉTODO 3: ESCRITURA DE CLASIFICACIÓN ---
    public static void escriureClassificacio(Map<String, Integer> classificacio) {
        // Pasos a seguir:
        // 1. Crea un PrintWriter para "classificacio.txt"
        // 2. Usa classificacio.entrySet().stream()
        // 3. Ordena por valor (.sorted) de mayor a menor (.reversed)
        // 4. Escribe cada línea en el archivo
        // 5. Cierra el escritor
    }
}