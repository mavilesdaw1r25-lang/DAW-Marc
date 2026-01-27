
package EX3;

    public class Electrodomestic implements Producte {
    private String id;
    private String nom;
    private double preu;
    private String marca; // Atribut extra [cite: 20]

    public Electrodomestic(String id, String nom, double preu, String marca) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
        this.marca = marca;
    }

    @Override public String getId() { return id; }
    @Override public String getNom() { return nom; }
    @Override public double getPreu() { return preu; }

    @Override
    public String toString() {
        return "Electrodomèstic [ID=" + id + ", Nom=" + nom + ", Preu=" + preu + ", Marca=" + marca + "]";
    }
}

