package coleccionesdegenericos;

import java.util.*;

// Demostración de la interfaz Collection mediante un objeto ArrayList.
public class PruebaCollection {

    public static void main(String[] args) {

        // agrega los elementos de la interfaz Collection mediante un objeto ArrayList.
        String[] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
        /* ArrayList es una clase genérica, por lo que podemos específicar un argumento
         * de tipo (String en este caso) para indicar el tipo de los elementos en cada lista. */
        List<String> lista = new ArrayList<String>();

        for (String color : colores) {
            lista.add(color); // agrega el color al final de la lista.
        }

        // agrega los elementos en el arreglo eliminarColores a eliminarLista.
        String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
        List<String> eliminarLista = new ArrayList<String>();

        for (String color : eliminarColores) {
            eliminarLista.add(color);
        }

        // imprime en pantalla el contenido de la Lista.
        System.out.println("ArrayList: ");

        for (int cuenta = 0; cuenta < lista.size(); cuenta++) {
            System.out.printf("%s ", lista.get(cuenta));
        }

        // elimina de la lista los colores contenidos en eliminarLista.
        eliminarColores(lista, eliminarLista);

        // imprime en pantalla el contenido de la lista.
        System.out.println("\n\nArrayList despues de llamar a eliminarColores:");

        // imprime en pantalla el contenido de la lista.
        for (String color : lista) {
            System.out.printf("%s ", color);
        }

    }

    // elimina de coleccion1 los colores específicados en coleccion2.
    public static void eliminarColores(Collection<String> coleccion1,
                                       Collection<String> coleccion2) {
        /* Se llama al método iterator de Collection, el cual obtiene un Iterator para
         * el objeto Collection. Las interfaces Collection e Iterator sin tipos genéricos. */
        Iterator<String> iterador = coleccion1.iterator();

        /* Se hace una llamada al método hasNext de Iterator para determinar si has más
         * elementos por los cuales iterar. El método hasNext devuelve true si otro elemento
         * existe, y devuelve false en caso contrario. */
        while (iterador.hasNext()) {
            /* Se llama al método next de Iterator para obtener una referencia al siguiente
             * elemento, y después se utiliza el método contains del segundo objeto Collection
             * (coleccion2) para determinar si la coleccion2 contiene el elemento devuelto por
             * next. */
            if (coleccion2.contains(iterador.next())) {
                /* Se hace una llama al método remove de Iterator para eliminar el elemento del
                 * objeto collecion1 de Collection. */

                iterador.remove();  // elimina el elemento actual.
            }
        }
    }

    // Programa que cuenta el número de ocurrencias de cada palabra en un objeto String.
    public static class ConteoTipoPalabras {

        public static void main(String[] args) {

            /* Los objetos Map asocian claves a valores. Las claves en un objeto Map deben ser
             * únicas, pero los valores asociados no. Si un objeto Map contiene claves y valores
             * únicos, se dice que implementa una asociación de uno a uno. Si sólo las claves son
             * únicas, se dice que el objeto Map implementa una asociación de varios a uno; muchas
             * claves peuden asociarse a un solo valor. */
            Map<String, Integer> miMap = new HashMap<>();
            /* Los objetos Map difieren de los objetos Set en tanto que los primeros contienen
             * claves y valores, mientras que los segundos contienen solo valores. Tres de las
             * muchas clases que implementan a la interfaz Map son Hashtable, HashMap, Y TreeMap.
             * La interfaz SortedMap extiende a Map y mantiene sus claves en orden; ya sea el
             * orden natural de los elementos o en un orden especificado por un objeto Comparator. */

            crearMap(miMap);
            mostrarMapa(miMap);
        }

        private static void crearMap(Map<String, Integer> mapa) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba una cadena: ");
            String entrada = scanner.nextLine();

            // divide la entrada en tokens
            String[] tokens = entrada.split(" ");

            // procesamiento del texto en entrada
            for (String token : tokens) {
                // obtiene una palabra en minúsculas.
                String palabra = token.toLowerCase();

                // si el mapa contiene la palabra
                if (mapa.containsKey(palabra)) { // ¿Está la palabra en el mapa?
                    int cuenta = mapa.get(palabra);
                    mapa.put(palabra, cuenta + 1);
                } else {
                    // agrega una nueva palabra con cuenta de 1 al mapa.
                    mapa.put(palabra, 1);
                }
            }
        }

        public static void mostrarMapa(Map<String, Integer> mapa) {

            // obtiene las claves
            Set<String> claves = mapa.keySet();

            SortedSet<String> clavesOrdenadas = new TreeSet<>(claves);

            System.out.printf("%nEl mapa contiene:%nClave\t\t\tValor%n");

            // genera la salida para cada clave en el mapa
            for (String clave : clavesOrdenadas) {
                System.out.printf("%-10s%10s%n", clave, mapa.get(clave));
            }

            System.out.printf("%nsize: %d%nisEmpty: %b%n", mapa.size(), mapa.isEmpty());
        }

    }
}
