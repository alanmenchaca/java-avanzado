package coleccionesdegenericos;

import java.util.*;

// Programa que cuenta el número de ocurrencias de cada palabra en un objeto String
public class ConteoTipoPalabras { 

    /* Los objetos HashMap tienen una capacidad incial predeterminada (16 elementos) y un
     * factor de carga predeterminado (0.75). HashMap es una clase genérica que recibe dos
     * argumentos: el tipo clave y el tipo de valor.*/
    public static void main(String[] args) {

        /* Los objetos Map asocian claves y valores. Las claves en un objeto Map debe ser
         * únicas, pero los valores asociados no. Si un objeto Map contiene claves y valores
         * únicos, se dice que implementa una asociación de uno a uno. Si sólo las claves son
         * únicas, se dice que el objeto Map implementa una asociación de varios a uno; muchas
         * claves pueden asociarse a un solo valor. */
        Map<String, Integer> miMap = new HashMap<>();
        /* Los objetos Map difieren de los objetos Set en tanto que los primeros contienen
         * claves y valores, mientras que los segundos contienen solamente valores. Tres de
         * las muchas clases que implementan a la interfaz Map son Hashtabe, HashMap y TreeMap.
         * La interfaz SortedMap extiende a Map y mantiene sus claves en orden; ya sea en orden
         * natural de los elementos o un orden especificado por un objeto Comparator. */

        // crea un mapa con base en la entrada del usuario
        crearMap(miMap);
        mostrarMap(miMap);
    }

    public static void crearMap(Map<String, Integer> mapa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una cadena:");
        String entrada = scanner.nextLine();

        // dividde la entrada en tokens
        String[] tokens = entrada.split(" ");

        for (String token : tokens) {
            String palabra = token.toLowerCase();

            /* Se hace una llamada al método containsKey de Map pata determinar si la
             * palabra está en el mapa (y por ende, que ha ocurrido antes en la cadena). */
            if (mapa.containsKey(palabra)) { // ¿Está la palabra en el mapa?
                /* El método get de Map obtiene el valor asociado de a la clave. */
                int cuenta = mapa.get(palabra);
                // incrementa la cuenta.
                mapa.put(palabra, cuenta + 1);
            } else {
                /* El método put de Map crea una nueva entrada en el mapa, con la clave y
                 * un objeto Integer que contiene 1 como valor. */
                mapa.put(palabra, 1);
            }
        }
    }

    public static void mostrarMap(Map<String, Integer> mapa) {
        // obtiene las claves
        Set<String> clavesOrdenadas = mapa.keySet();

        System.out.printf("%nEl mapa contiene:%nClave\t\t\tValor%n");

        // genera la salida para cada clave en el mapa
        for (String clave : clavesOrdenadas) {
            System.out.printf("%-10s%10s%n", clave, mapa.get(clave));
        }

        /* Se hace una llamada al método size de Map para obtener el número de pares
         * clave-valor en el objeto Map. También se hace una llamada al método isEmpty de
         * Map, el cual devuelve un valor boolean que indica si el objeto Map está
         * vacío o no. */
        System.out.printf("%nsize: %d%nisEmpty: %b%n", mapa.size(), mapa.isEmpty());
    }
}
