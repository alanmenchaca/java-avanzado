package coleccionesdegenericos.clasecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento3 {

    public static void main(String[] args) {
        /* Se crea un objeto ArrayList de objetos Tiempo (ArrayList y List son tipos
         * genéricos y aceptan un argumento de tipo que especifica el tipo de los
         * elementos de la colección). */
        List<Tiempo> lista = new ArrayList<>();

        lista.add(new Tiempo(6, 24, 34));
        lista.add(new Tiempo(18, 14, 58));
        lista.add(new Tiempo(6, 5, 34));
        lista.add(new Tiempo(12, 14, 58));
        lista.add(new Tiempo(6, 24, 22));

        // imprime los elementos del objeto List
        System.out.printf("Elementos del arreglo desordenados: %n%s%n", lista);

        /* Se hace una llamada al método sort, y le pasamos un objeto de nuestra clase
         * CompararTiempo. */
        Collections.sort(lista, new ComparadorTiempo());
        /* Se ordena una lista mediante el uso de la clase Comparator personalizada,
         * llamada ComparadorTiempo. */

        // imprime los elementos del objeto List
        System.out.printf("Elementos del arreglo ordenados: %n%s%n", lista);
    }
}
