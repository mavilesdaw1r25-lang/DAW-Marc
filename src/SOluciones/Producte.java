

package SOluciones;


public class Producte {

    private String nom;
    private double preu;
    private int quantitat;

    public Producte(String nom, double preu, int quantitat) throws DadaInvalidaException {
        if (preu <= 0) {
            throw new DadaInvalidaException("El preu ha de ser major que 0.");
        }
        if (quantitat <= 0) {
            throw new DadaInvalidaException("La quantitat ha de ser un valor positiu.");
        }
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    public double calcularTotal() {
        return preu * quantitat;
    }

    @Override
    public String toString() {
        return nom + " - Preu: " + preu + "€ - Quantitat: " + quantitat + " - Total: " + calcularTotal() + "€";
    }
}

