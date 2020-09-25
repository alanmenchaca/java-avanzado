package coleccionesdegenericos.ordenamientos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Uso de un objeto Comparator con el algoritmo sort.
public class Ordenamiento2 {

    public static void main(String[] args) {

        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una list que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desorenados: %s%n", lista);

        /* Se hace una llamada al método sort de Collections para ordenar el objeto List
         * en orden descendente. El método static reverseOrder de Collections devuelve un
         * objeto Comparator que ordena los elementos de la colección en forma inversa. */
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos de la lista ordenados %s%n", lista);
    }
}
