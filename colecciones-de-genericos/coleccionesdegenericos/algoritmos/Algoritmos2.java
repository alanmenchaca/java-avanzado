package coleccionesdegenericos.algoritmos;

import java.util.*;

// Los métodos addAll, frequency, y disjoint de Collections.
public class Algoritmos2 {

    public static void main(String[] args) {

        // inicializa lista1 y lista2
        String[] colores = {"rojo", "blanco", "amarillo", "azul"};
        List<String> lista1 = Arrays.asList(colores);
        ArrayList<String> lista2 = new ArrayList<>();

        lista2.add("negro"); // agrega "negro" al final de lista2
        lista2.add("rojo"); // agrega "rojo" al final de lista2
        lista2.add("verde"); // agrega "verde" al final de lista2

        System.out.print("Antes de addAll, lista2 contiene: ");
        for (String color : lista2) {
            System.out.printf("%s ", color);
        }

        // agrega los objetos String de colores a lista2.
        Collections.addAll(lista2, colores);
        /* El método addAll de Collectiosn recibe dos argumentos: un objeto Collection
         * en el que se van a insertar los nuevos elementos y un arreglo que proporciona
         * los elementos a insertar. */

        System.out.printf("%nDespués de addAll, lista2 contiene: ");
        for (String color : lista2) {
            System.out.printf("%s ", color);
        }

        // obtiene la frecuencia de rojo
        int frecuencia = Collections.frequency(lista2, "rojo");
        /* El método frequency de Collections recibe dos argumentos: un objeto Collection
         * en el que se va a buscar y un objeto Object que se va a buscar en la colección. */
        System.out.printf("%nFrecuencia de rojo en lista2: %d%n", frecuencia);

        // comprueba si lista1 y lista2 tienen elementos en común
        boolean desunion = Collections.disjoint(lista1, lista2);
        /* El método disjoint de Collections recibe dos objetos Collections y devuelve true
         * si no tienen elementos en común. */
        System.out.printf("lista1 y lista2 %s elementos en común%n", desunion ? "no tiene" : "tiene");
    }
}
