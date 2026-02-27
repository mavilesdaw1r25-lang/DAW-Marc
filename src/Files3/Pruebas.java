import java.util.*;
import java.util.stream.Collectors;

// =========================================================
// INTERFÍCIE FUNCIONAL (EXERCICI 6)
// Definim la interfície fora de la classe principal[cite: 22].
// =========================================================
@FunctionalInterface
interface Prova<T> {
    int aplicar(T t);
}


public class Prueabas {

    public static void main(String[] args) {
        
        // --- 0. PREPAREM LES DADES DE PROVA ---
        // Llista inicial per poder resoldre els exercicis[cite: 10, 12].
        List<Jugador> llistaJugadors = crearLlistaProva();


        // =========================================================
        // EXERCICI 0: Invertir i ordenar taula de Strings
        // =========================================================
        System.out.println("\n--- EXERCICI 0 ---");
        String[] nomsOriginals = {"Ana", "Pere", "Pol", "Xavi"};
        
        // Cridem al mètode que hem creat a baix
        String[] nomsInvertits = exercici0(nomsOriginals);
        
        System.out.println("Originals: " + Arrays.toString(nomsOriginals));
        System.out.println("Invertits i ordenats: " + Arrays.toString(nomsInvertits));


        // =========================================================
        // EXERCICI 1: Ordenar llista per punts i dorsal [cite: 13, 14]
        // =========================================================
        System.out.println("\n--- EXERCICI 1 ---");
        
        llistaJugadors.sort((j1, j2) -> {
            int punts1 = j1.getEstadistiques()[0].getPuntuacio(); // Índex 0 = Punts
            int punts2 = j2.getEstadistiques()[0].getPuntuacio();
            
            if (punts1 != punts2) {
                // Si els punts són diferents, de més gran a més petit (descendent) [cite: 13]
                return Integer.compare(punts2, punts1); 
            } else {
                // En cas d'empat, per dorsal de forma ascendent [cite: 14]
                return Integer.compare(j1.getDorsal(), j2.getDorsal()); 
            }
        });
        
        for (Jugador j : llistaJugadors) {
            System.out.println(j.getNom() + " -> Punts: " + j.getEstadistiques()[0].getPuntuacio() + " | Dorsal: " + j.getDorsal());
        }


        // =========================================================
        // EXERCICI 2: Eliminar jugadors amb < 5 en assistències [cite: 15]
        // =========================================================
        System.out.println("\n--- EXERCICI 2 ---");
        
        // Índex 1 = Assistències. Si és menor que 5, s'elimina[cite: 15].
        llistaJugadors.removeIf(j -> j.getEstadistiques()[1].getPuntuacio() < 5);
        
        System.out.println("Jugadors restants (Assistències >= 5):");
        for (Jugador j : llistaJugadors) System.out.println("- " + j.getNom());


        // =========================================================
        // EXERCICI 3: Streams - Llista de rebots incrementats [cite: 16]
        // =========================================================
        System.out.println("\n--- EXERCICI 3 ---");
        
        List<Integer> nousRebots = llistaJugadors.stream()
            .map(j -> j.getEstadistiques()[2].getPuntuacio()) // Traiem els rebots (Índex 2) [cite: 16]
            .map(rebots -> rebots < 10 ? rebots + 1 : rebots) // Incrementem en 1 només si té menys de 10 [cite: 16]
            .collect(Collectors.toList());
            
        System.out.println("Llista de nous rebots: " + nousRebots);


        // =========================================================
        // EXERCICI 4: Map (Clau: Dorsal, Valor: Jugador) [cite: 18]
        // =========================================================
        System.out.println("\n--- EXERCICI 4 ---");
        
        // Usem TreeMap perquè ja ordena les claus (els dorsals) automàticament [cite: 18]
        Map<Integer, Jugador> mapaJugadors = new TreeMap<>();
        
        for (Jugador j : llistaJugadors) {
            mapaJugadors.put(j.getDorsal(), j);
        }
        
        System.out.println("Dorsals ordenats al Map: " + mapaJugadors.keySet());


        // =========================================================
        // EXERCICI 5: TreeSet ordenat per nom i dorsal [cite: 20]
        // =========================================================
        System.out.println("\n--- EXERCICI 5 ---");
        
        Set<Jugador> setJugadors = new TreeSet<>((j1, j2) -> {
            int compararNom = j1.getNom().compareTo(j2.getNom());
            if (compararNom != 0) return compararNom; // Ordenem per nom [cite: 20]
            return Integer.compare(j1.getDorsal(), j2.getDorsal()); // En cas d'empat, per dorsal [cite: 20]
        });
        
        setJugadors.addAll(llistaJugadors); // Omplim el Set de cop
        
        System.out.println("Jugadors amb tot aprovat:");
        for (Jugador j : setJugadors) {
            boolean aprovaTot = true;
            // Comprovem les 3 estadístiques: punts, assistències i rebots
            for (int i = 0; i < j.getEstadistiques().length; i++) {
                if (j.getEstadistiques()[i].getPuntuacio() < 5) {
                    aprovaTot = false; // Ha suspès alguna!
                }
            }
            // Mostra només aquells que han tret 5 o més en totes les estadístiques [cite: 21]
            if (aprovaTot) {
                System.out.println("- " + j.getNom());
            }
        }


        // =========================================================
        // EXERCICI 6: Ús de la Interfície Funcional en el main [cite: 24]
        // =========================================================
        System.out.println("\n--- EXERCICI 6 ---");
        
        // Definim que la implementació serà la puntuació del jugador (índex 0) [cite: 24]
        mostrarEstadistica(llistaJugadors, j -> j.getEstadistiques()[0].getPuntuacio());
        
    } // --- FI DEL MAIN ---



    // =========================================================
    // MÈTODES FORA DEL MAIN (Exercici 0 i 6) [cite: 11]
    // =========================================================

    // MÈTODE EXERCICI 0 [cite: 3]
    public static String[] exercici0(String[] noms) {
        // Creem una nova taula per no modificar la taula original [cite: 3, 6]
        String[] resultat = new String[noms.length]; 
        
        for (int i = 0; i < noms.length; i++) {
            String original = noms[i];
            String invertit = "";
            
            // Llegim la paraula de dreta a esquerra [cite: 4]
            for (int j = original.length() - 1; j >= 0; j--) {
                invertit += original.charAt(j);
            }
            resultat[i] = invertit;
        }
        
        // Ordenem per la longitud del nom invertit, de menor a major [cite: 5]
        Arrays.sort(resultat, (a, b) -> a.length() - b.length());
        
        return resultat;
    }


    // MÈTODE EXERCICI 6 [cite: 23]
    // Fes un mètode que rebi la llista de jugadors i una instància de la interfície [cite: 23]
    public static void mostrarEstadistica(List<Jugador> llista, Prova<Jugador> funcio) {
        for (Jugador j : llista) {
            int valorObtingut = funcio.aplicar(j);
            // Imprimeixi el nom i el valor obtingut [cite: 23]
            System.out.println(j.getNom() + " -> " + valorObtingut); 
        }
    }


    // =========================================================
    // MÈTODE AUXILIAR (Per generar dades falses i provar-ho) 
    // =========================================================
    private static List<Jugador> crearLlistaProva() {
        List<Jugador> llista = new ArrayList<>();
        // Marc: Molts punts.
        llista.add(new Jugador("Marc", 33, new Estadistica[]{new Estadistica("Punts", 9), new Estadistica("Assist", 6), new Estadistica("Rebots", 8)}));
        // Pau: Empata a punts amb Marc, però dorsal menor (per provar l'empat). Males assistències (4).
        llista.add(new Jugador("Pau", 16, new Estadistica[]{new Estadistica("Punts", 9), new Estadistica("Assist", 4), new Estadistica("Rebots", 10)}));
        // Ricky: Treu deus en tot (Aprova tot).
        llista.add(new Jugador("Ricky", 9, new Estadistica[]{new Estadistica("Punts", 10), new Estadistica("Assist", 10), new Estadistica("Rebots", 10)}));
        return llista;
    }
}


// =========================================================
// CLASSES PELS OBJECTES (Estructura bàsica) 
// =========================================================
class Jugador {
    private String nom;
    private int dorsal;
    private Estadistica[] estadistiques; // Taula de 3 objectes [cite: 8]

    public Jugador(String nom, int dorsal, Estadistica[] estadistiques) {
        this.nom = nom;
        this.dorsal = dorsal;
        this.estadistiques = estadistiques;
    }
    public String getNom() { return nom; }
    public int getDorsal() { return dorsal; }
    public Estadistica[] getEstadistiques() { return estadistiques; }
}

class Estadistica {
    private String nomCategoria; // [cite: 9]
    private int puntuacio;       // [cite: 9]

    public Estadistica(String nomCategoria, int puntuacio) {
        this.nomCategoria = nomCategoria;
        this.puntuacio = puntuacio;
    }
    public int getPuntuacio() { return puntuacio; }
}