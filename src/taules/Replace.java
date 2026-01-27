
package taules;

public class Replace {


    public static void main(String args[]) {
        String lletres = "abcdefghijklmabcdefghijklm";

        System.out.printf(
                "'c' es troba a l'índex %d\n", lletres.indexOf('c'));
        System.out.printf(
                "'a' es troba a l'índex %d\n", lletres.indexOf('a', 1));
        System.out.printf(
                "'$' es troba a l'índex %d\n\n", lletres.indexOf('$'));


        System.out.printf("La última 'c' es troba a l'índex %d\n",
                lletres.lastIndexOf('c'));
        System.out.printf("La última 'a' es troba a l'índex %d\n",
                lletres.lastIndexOf('a', 25));
        System.out.printf("La última '$' es troba a l'índex %d\n\n",
                lletres.lastIndexOf('$'));


        System.out.printf("\"def\" es troba a l'índex %d\n",
                lletres.indexOf("def"));
        System.out.printf("\"def\" es troba a l'índex %d\n",
                lletres.indexOf("def", 7));
        System.out.printf("\"hola\" es troba a l'índex %d\n\n",
                lletres.indexOf("hola"));

        System.out.printf("La última ocurrència de \"def\" es troba a l'índex %d\n",
                lletres.lastIndexOf("def"));
        System.out.printf("La última ocurrència de \"def\" es troba a l'índex %d\n",
                lletres.lastIndexOf("def", 25));
        System.out.printf("La última ocurrència de \"hola\" es troba a l'índex %d\n",
                lletres.lastIndexOf("hola"));
    }
 }


