
package EX3;

    import java.util.ArrayList;
import java.util.List;

public class Inventari<T extends Producte> {
    private List<T> productes = new ArrayList<>(); // Gestiona una llista [cite: 22]

    public void afegir(T p) {
        for (T existent : productes) {
            if (existent.getId().equals(p.getId())) {
                throw new IllegalArgumentException("Error: El producte amb ID " + p.getId() + " ja existeix."); // [cite: 24, 25]
            }
        }
        productes.add(p);
    }

    public T consultar(String id) {
        for (T p : productes) {
            if (p.getId().equals(id)) return p;
        }
        throw new IllegalArgumentException("Error: Producte amb ID " + id + " no trobat."); // [cite: 26]
    }

    public void eliminar(String id) {
        T p = consultar(id); // Primer crida al mètode consultar [cite: 27]
        productes.remove(p);
    }

    public void mostrarTots() {
        if (productes.isEmpty()) {
            System.out.println("L'inventari està buit.");
        } else {
            productes.forEach(System.out::println); // [cite: 28]
        }
    }

}
