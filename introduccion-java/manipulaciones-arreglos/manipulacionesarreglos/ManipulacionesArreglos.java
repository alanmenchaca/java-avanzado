package manipulacionesarreglos;

// Fig. 7.22: ManipulacionesArreglos.java
// Métodos de la calse Arrays y System.arraycopy.
import java.util.Arrays;

public class ManipulacionesArreglos {

    public static void main(String[] args) {

        // ordena arregloDouble en forma ascendente
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(arregloDouble);
        System.out.printf("%narregloDouble: ");

        for (double valor : arregloDouble) {
            System.out.printf("%.1f", valor);
        }

        // llena arreglo de 10 elementos con 7
        int[] arregloIntLleno = new int[10];
        /* Las versiones sobrecargadas de fill nos permiten llenar un rango específico
        de elementos con el mismo valor. */
        Arrays.fill(arregloIntLleno, 7);
        mostrarArreglo(arregloIntLleno, "arregloIntLleno");

        // copia el arreglo arregloInt en el arreglo copiaArregloInt
        int[] arregloInt = {1, 2, 3, 4, 5, 6};
        int[] copiaArregloInt = new int[arregloInt.length];
        /* El primer argumento (arregloInt) que se pasa al método arraycopy de System es el
        arreglo a partir del cual se van a copiar los elementos. El segundo argumento (0) es 
        el índice que específica el punto de inicio en el rango de elementos que se van a
        copiar del arreglo. El tercer argumento (copiaArregloInt) específica el arreglo de
        destino que almacenará la copia). El cuarto argumento (0) específica el índice en el
        arreglo de destino en donde deberá guardarse el primer elemento cpiado. El último 
        argumento específica el número de elementos a copiar del arreglo en el primer argumento. */
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
        mostrarArreglo(arregloInt, "arregloInt");
        mostrarArreglo(copiaArregloInt, "copiaArregloInt");

        // compara si arregloInt y copiaArregloInt son iguales.
        boolean b = Arrays.equals(arregloInt, copiaArregloInt);
        System.out.printf("%n%narregloInt %s copiaArregloInt%n", (b ? "==" : "!="));

        // compara si arregloInt y arregloIntLleno son iguales
        b = Arrays.equals(arregloInt, arregloIntLleno);
        System.out.printf("arregloInt %s copiaArregloIntLleno%n", (b ? "==" : "!="));

        // busca em arregloInt el valor 5
        int ubicacion = Arrays.binarySearch(arregloInt, 5);

        // Pasar un arreglo desordenado al método binarySearch es un error lógico; el valor
        // devuelto es indefinido.
        if (ubicacion >= 0) {
            System.out.printf("Se encontro 5 en el elemento %d de arregloInt%n", ubicacion);
        } else {
            System.out.println("No se encontro el 5 en arregloInt");
        }

        // busca en arregloInt el valor 8763
        ubicacion = Arrays.binarySearch(arregloInt, 8763);

        if (ubicacion >= 0) {
            System.out.printf("Se encontro el 8763 en el elemento %d de arregloInt%n", ubicacion);
        } else {
            System.out.println("No se encontro el 8763 en el arregloInt");
        }

    }

    // imprime los valores en cada arreglo
    public static void mostrarArreglo(int[] arreglo, String descripcion) {
        System.out.printf("%n%s: ", descripcion);

        for (int valor : arreglo) {
            System.out.printf("%d ", valor);
        }
    }
}
