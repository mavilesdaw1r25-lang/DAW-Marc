package Practicas;

public interface Animal {

    int MIDA = 0;

    void menja();

    String crida();

    int creix(int centimetres);

}

class Exercici2 {

    public static void main(String[] args) {

        Animal gat = new Animal() {
            @Override
            public void menja() {
                System.out.println("Croquetes de peix");

            }

            @Override
            public String crida() {
                return "Miau";
            }

            @Override
            public int creix(int centimetres) {

                return MIDA + centimetres;
            }
        };
        gat.menja();
        System.out.println(gat.crida());
        System.out.println(gat.creix(12));
    }
}
