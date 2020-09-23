package coleccionarraylist;

// Fig. 7.24: ColeccionArrayList.java
import java.util.ArrayList;

public class ColeccionArrayList {

    public static void main(String[] args) {

        // creamos un nuevo objeto ArrayList de objetos String con una capacidad
        // inicial de 10
        ArrayList<String> elementos = new ArrayList<>();

        elementos.add("Rojo"); // adjunta un elemento a la lista.
        elementos.add("Amarillo"); // inserta "Amarillo" en el índice 0.

        // encabezado
        System.out.print("Mostrar contenido de lista con ciclo controlado por contador.");

        for (int i = 0; i < elementos.size(); i++) {
            System.out.printf(" %s", elementos.get(i));
        }

        // muestra los colores usando for en el método mostrar
        mostrar(elementos, "\nMostrar contenido de lista con instruccion for mejorada:");

        elementos.add("Verde"); // agrega "Verde" al final de la lista
        elementos.add("Amarillo"); // agrega "Amarillo" al final de la lista
        mostrar(elementos, "\nLista con dos nuevos elementos:");
        
        elementos.remove("Amarillo"); // elimina el primer "amarillo"
        mostrar(elementos, "Eliminar primera instancia de amarillo:");

        elementos.remove(1); // elimina el elemento en subíndice 1.
        mostrar(elementos, "\nEliminar segundo elemento de la lista (verde):");

        // verifica si hay un valor en la lista
        System.out.printf("\n\"rojo\" %sesta en la lista%n",
                elementos.contains("rojo") ? "" : "no ");
        
        // muestra el número de elementos de la lista
        System.out.printf("Tamaño: %s%n", elementos.size());
    }

    public static void mostrar(ArrayList<String> elementos, String encabezado) {

        System.out.print(encabezado); // mostrar encabezado

        for (String elemento : elementos) {
            System.out.printf(" %s", elemento);
        }
    }
}
