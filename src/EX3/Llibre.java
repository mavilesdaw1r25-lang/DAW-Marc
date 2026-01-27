
package EX3;

    public class Llibre implements Producte {
    private String id;
    private String nom;
    private double preu;
    private String autor; 

    public Llibre(String id, String nom, double preu, String autor) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
        this.autor = autor;
    }

    @Override public String getId() { return id; }
    @Override public String getNom() { return nom; }
    @Override public double getPreu() { return preu; }

    @Override
    public String toString() {
        return "Llibre [ID=" + id + ", Nom=" + nom + ", Preu=" + preu + ", Autor=" + autor + "]";
    }
}

