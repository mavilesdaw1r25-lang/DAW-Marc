/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

public class SuperClasse {

    public void vinga() {
        System.out.println("Superclasse");
    }

    public static void main(String[] args) {

        SuperClasse c = new SuperClasse() {

            public void vinga() {
                System.out.println("Classe anònima");
            }

        };
        c.vinga();
    }
}
