package manejocolecciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {  

    public static void main(String[] args) {

        //  Una lista es una colección ordenada, la cual si permite elementos duplicados.
        /* La variable de tipo List es una interface (no podemos crear un objeto de esa clase), y le asignamos 
        una referencia de la clase ArrayList (clase concreta que incorpora la interface List). */
        List miLista = new ArrayList();

        /* Al no específicar el tipo de dato en el arreglo que se esta utilizando, la lista por
        defecto es de tipo object (sin embargo es posible especificar el tipo de dato). */
        miLista.add("1");
        // Agregamos un elemento utilizando el método add()
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        // Elemento repetido
        miLista.add("4");
        imprimir(miLista, "ArrayList");

        /* Un set es una colección no ordenada de elementos, no se permiten elementos duplicados por lo
        que cualquier elemento duplicado no se insertará dentro del Set. */
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");

        // La clase HashSet no permite elementos duplicados (los ignora).
        miSet.add("300");
        imprimir(miSet, "HashSet");

        // Un mapa relaciona una llave con un valor formando una especie de table de datos.
        /* Definimos una variable llamada miMapa la cual es de tipo Map (una interface), y vamos a 
        asignarle una referencia en memoria de objeto de tipo HashMap. */
        Map miMapa = new HashMap();
        // Llave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        // Se imprimen todas las llaves (El método nos retorna una colección de datos de tipo Set).
        imprimir(miMapa.keySet(), "LLaves de HashMap");
        // Se imprimen todos los valores.
        imprimir(miMapa.values(), "Valores de HashMap");
    }

    /* El tipo de dato que recibe es de tipo Collection (es la interface principal del api de Colletions)
    y por lo tanto puede apuntar a objetos de tipo List, Set o Map (el cual podemos dividir en 2 partes,
    recibiendo las llaves o valores de Map por separado). */
    public static void imprimir(Collection coleccion, String descripcion) {
        // Método generico el cual recibe todo tipo de Colecciones y las procesa, esto es posible ya que
        // las clases mencionadas anteriormente implementan la interface Collection (es la clase padre del api de Collections).

        // Recorremos todos los elementos de acuerdo a la colección especificada.
        System.out.printf("%20s: ", descripcion);
        for (Object elemento : coleccion) {
            System.out.printf("%s, ", elemento);
        }
        System.out.println();

    }

}
