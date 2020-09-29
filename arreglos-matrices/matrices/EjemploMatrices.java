package matrices;

public class EjemploMatrices {

    public static void main(String[] args) {
        // 1. Declarar una matriz de int.
        int edades[][];
        // 2. Instanciar la matriz de int.
        edades = new int[3][2];
        // 3. Instanciar los valores de la matriz.
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        // 4. Imprimir
        System.out.println("Matriz enteros índice 0 0: " + edades[0][0]);
        System.out.println("Matriz enteros índice 0 0: " + edades[2][0]);

        // 1. Declarar e instanciar matriz tipo Object.
        Persona personas[][] = new Persona[1][2];

        // 2. Inicializamos valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");

        System.out.println("Matriz personas índice 0 0: " + personas[0][0]);
        System.out.println("Matriz peersonas índice 0 1: " + personas[0][1]);

        System.out.println();

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz enteros índice: " + i + " - " + j + ": " + personas[i][j]);
            }
        }

        System.out.println();

        String[][] nombres = {{"Teresa", "Cesar", "William"},{"Yesenia", "Esteban", "María"}};
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Matriz nombres índice: " + i + " - " + j + ": " + nombres[i][j]);
            }
        }
    }
}
