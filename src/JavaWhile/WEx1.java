package JavaWhile;



    public class WEx1 {
    public static void main(String[] args) {
        
        java.util.Scanner lector = new java.util.Scanner(System.in);
        int numero = lector.nextInt();  
        int maximo = numero;  
        int minimo = numero;  

        while (numero >= 0) {  
            if (numero > maximo) {
                maximo = numero;  
            }
            if (numero < minimo) {
                minimo = numero;  
            }
            System.out.print("Introdueix un altre número (negatiu per acabar): ");
            numero = lector.nextInt();  
        }
        System.out.println("El número més petit és: " + minimo);
        System.out.println("El número més gran és: " + maximo);
    }
}

