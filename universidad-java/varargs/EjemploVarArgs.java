package varargs;

public class EjemploVarArgs {

    public static void main(String[] args) {
        // Imprimir varios números.
        imprimirNumerosForEach(2, 4, 5, 7);

        System.out.println("");
        imprimirNumerosForEach(2, 4, 5, 6, 7, 2, 4, 5);

        System.out.println("");
        variosParametros("Juan", true, 15, 14, 13);
    }

    /* Los varargs son métodos que permiten variar el número de parámetros que reciben permitiendo
    trabajar de una forma más cómoda. */
    public static void imprimirNumeros(int... numeros) {
        // Recorremos cada elemento.
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": " + elemento);
        }
    }

    public static void imprimirNumerosForEach(int... numeros) {
        // Usamos forEach en lugar de un for normal.
        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {

        System.out.println("Nombre: " + nombre);

        System.out.println("Valido: " + valido);

        // Usamos forEach
        for (int numero : numeros) {
            System.out.println("El número es: " + numero);
        }
    }
}
