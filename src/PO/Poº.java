package PO;


public class Poº {

    //public static saluda --->() { 
    // Codigo de metodo ---> int a, int b 
    //}
    public static void saluda() {

        System.out.println("hola");

    }

    public static void saludaAAlgu(String nom, int edat) {
        System.out.println("Hola" + nom + " i tens " + edat + "anys");

    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        //return num1+num2
        return suma;

    }

    public static int demanarNumero() {
        int valor = demanarNumero();
        System.out.println("EL numero és: " + valor);

    }

    
    public static void main(String[] args) {
        int resultat;
        resultat = sumar(44, 77);
        System.out.println("EL resultat és: " + resultat);
    }

}

