import java.io.*;
import java.util.*;

public class CompeticioFutbol {

    public static void main(String[] args) {
        // 1. Partiremos de una lista con 5 equipos.
        List<String> equips = Arrays.asList("Barça", "Madrid", "Sevilla", "Betis", "València");
        
        System.out.println("Iniciando simulación de la competición...");

        // Llamamos a los tres métodos en orden
        escriureResultatsAleatoris(equips);
        
        // Guardamos el mapa que nos devuelve el segundo método en una variable
        Map<String, Integer> classificacio = llegirResultatsICalcularClassificacio();
        
        escriureClassificacio(classificacio);
        
        System.out.println("¡Proceso completado! Revisa los archivos resultats.txt y classificacio.txt en la carpeta de tu proyecto.");
    }

    // Método 1: Generar resultados y guardarlos
    public static void escriureResultatsAleatoris(List<String> equips) {
        Random aleatori = new Random();
        
        // Usamos try-with-resources para que el archivo se cierre automáticamente
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultats.txt"))) {
            
            // Hacemos que jueguen todos contra todos una única vez.
            // Para eso usamos dos bucles for anidados.
            for (int i = 0; i < equips.size(); i++) {
                for (int j = i + 1; j < equips.size(); j++) {
                    
                    String equip1 = equips.get(i);
                    String equip2 = equips.get(j);
                    
                    // Generamos los goles entre 0 y 5
                    int golsEquip1 = aleatori.nextInt(6);
                    int golsEquip2 = aleatori.nextInt(6);
                    
                    // Escribimos en el archivo con el formato: Equip1 Equip2 GolsEquip1 GolsEquip2
                    writer.println(equip1 + " " + equip2 + " " + golsEquip1 + " " + golsEquip2);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de resultados: " + e.getMessage());
        }
    }

    // Método 2: Leer el archivo, calcular puntos y devolver un Map
    public static Map<String, Integer> llegirResultatsICalcularClassificacio() {
        Map<String, Integer> classificacio = new HashMap<>();
        
        try (Scanner scanner = new Scanner(new File("resultats.txt"))) {
            
            // Leemos el archivo línea por línea mientras haya texto
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                
                // Dividimos la línea por los espacios para sacar cada dato
                String[] parts = linea.split(" ");
                String equip1 = parts[0];
                String equip2 = parts[1];
                int gols1 = Integer.parseInt(parts[2]);
                int gols2 = Integer.parseInt(parts[3]);
                
                // Aseguramos que los equipos existan en el mapa. Si no existen, les ponemos 0 puntos.
                classificacio.putIfAbsent(equip1, 0);
                classificacio.putIfAbsent(equip2, 0);
                
                // Calculamos los puntos
                if (gols1 > gols2) {
                    // Gana equip1: suma 3 puntos
                    classificacio.put(equip1, classificacio.get(equip1) + 3);
                } else if (gols2 > gols1) {
                    // Gana equip2: suma 3 puntos
                    classificacio.put(equip2, classificacio.get(equip2) + 3);
                } else {
                    // Empate: suman 1 punto cada uno
                    classificacio.put(equip1, classificacio.get(equip1) + 1);
                    classificacio.put(equip2, classificacio.get(equip2) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo resultats.txt: " + e.getMessage());
        }
        
        return classificacio;
    }

    // Método 3: Ordenar el Map y escribirlo en un archivo final
    public static void escriureClassificacio(Map<String, Integer> classificacio) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("classificacio.txt"))) {
            
            // Obtenemos los mapeos con entrySet() y abrimos un stream.
            // Los ordenamos por valor (los puntos) de forma invertida (reversed) para que el mayor esté arriba.
            classificacio.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entrada -> {
                    // Por cada entrada (equipo y puntos), obtenemos su clave y su valor y lo escribimos
                    writer.println(entrada.getKey() + " " + entrada.getValue());
                });
                
        } catch (IOException e) {
            System.out.println("Error al escribir la clasificación: " + e.getMessage());
        }
    }
}