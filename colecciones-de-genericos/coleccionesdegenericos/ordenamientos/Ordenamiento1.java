package coleccionesdegenericos.ordenamientos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Método sort de Collections
public class Ordenamiento1 {
    // Ordenamiento ascendente
    public static void main(String[] args) {

        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una list que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desorenados: %s%n", lista);

        /* Se utiliza el método sort de Collections para ordenar los elementos
         * de un objeto List de forma ascendete. El método sort realiza un
         * ordenamiento de combinación iterativo. */
        Collections.sort(lista);
        // ordena ArrayList
        System.out.printf("Elementos del arreglo ordenados: %s%n", lista);
    }
}
