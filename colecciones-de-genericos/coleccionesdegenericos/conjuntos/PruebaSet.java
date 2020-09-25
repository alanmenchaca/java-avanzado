package coleccionesdegenericos.conjuntos;

import java.util.*;

// Uso de un objeto HashSet para eliminar valores duplicados de un arreglo de cadenas.
public class PruebaSet {

    public static void main(String[] args) {

        // crea y muestra un objeto List<String>
        String[] colores = {"rojo", "blanco", "azul", "verde", "gris", "naranja",
                "carne", "blanco", "cyan", "durazno", "gris", "naranja"};

        List<String> lista = Arrays.asList(colores);
        System.out.printf("List: %s%n", lista);

        imprimirSinDuplicados(lista);
    }

    // crea un objeto Set a partir de un objeto Collection para eliminar duplicados.
    private static void imprimirSinDuplicados(Collection<String> valores) {

        /* Un objeto Set es un objeto Collection desordenado que contiene elementos únicos
         * (es decir, sin elementos duplicados). El marco de trabajo de colecciones contiene
         * varias implementaciones de Set, incluyendo el HashSet y TreeSet.*/
        Set<String> conjunto = new HashSet<>(valores);
        /* Los objetos Set no contienen valores duplicados, por lo que cuando se construye
         * el objeto HashSet, éste elimina los valores duplicados en el objeto Collection. */

        System.out.print("Los valores sin duplicados son: ");

        for (String valor : conjunto) {
            System.out.printf("%s ", valor);
        }

        System.out.println();
    }
}

