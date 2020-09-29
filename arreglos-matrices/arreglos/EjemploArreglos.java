package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {

        // 1. Declaramos un arreglo de tipo entero.
        int[] edades;

        // 2. Instancias el arreglo de enteros.
        edades = new int[3];

        // 3. Inicializamos los valores del arreglo de enteros.
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        // Imprimimos los valores del arreglo a la salida estandar.
        // 4. Leemos cada valor del arreglo.
        System.out.println("Arreglo de enteros índice 0: " + edades[0]);
        System.out.println("Arreglo de enteros índice 1: " + edades[1]);
        System.out.println("Arreglo de enteros índice 2: " + edades[2]);

        // 1.Declarar un arreglo de tipo object.
        Persona[] personas;

        // 2. Instanciar el arreglo de tipo object.
        personas = new Persona[4];

        // 3. Inicializar los valores del arreglo.
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        // 4. Imprimir los valores del arreglo.
        System.out.println("\nArreglo personas índice 0: " + personas[0]);
        System.out.println("Arreglo personas índice 1: " + personas[1]);
        System.out.println("Arreglo personas índice 2: " + personas[2]);
        System.out.println("Arreglo personas índice 3: " + personas[3]);
        // Solo los dos primeros arreglos tienen una referencia al objeto de tipo persona.

    }
}
