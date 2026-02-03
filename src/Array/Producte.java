/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

 
class Producte {

    private String nom;
    private int preu;

    public Producte(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public int getPreu() {
        return preu;
    }

    @Override
    public String toString() {
        return nom + " (" + preu + "€)";
    }
}