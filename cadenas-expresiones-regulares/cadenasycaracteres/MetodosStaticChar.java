
package cadenasycaracteres;

import java.util.Scanner;

/* Los métodos static  de Character para probar caracteres y conversión
 * de mayúsculas/minúsculas.*/
public class MetodosStaticChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba un caracter y oprima intro: ");
        String entrada = scanner.nextLine();
        // obtiene el caracter de entrada
        char caracter = entrada.charAt(0);

        /* Métodos static que prueban caracteres para determinar si son de un tipo de carácter
         * específico y los métodos static que realizan conversiones de caracteres de minúscula
         * a mayúscula, y viceversa.*/
        System.out.printf("Esta definido: %b%n", Character.isDefined(caracter));
        /* La mayoría de los métodos de la clase Character son static, diseñados para facilitar
         * el procesamiento de valores char individuales. */
        System.out.printf("Es digito: %b%n", Character.isDigit(caracter));
        System.out.printf("Es el primer caracter en un identificador de Java: %b%n",
                Character.isJavaIdentifierStart(caracter));
        System.out.printf("Es el primer caracter en un identificador de Java: %b%n",
                Character.isJavaIdentifierPart(caracter));
        System.out.printf("Es letra: %b%n", Character.isLetter(caracter));
        System.out.printf("Es letra o digito: %b%n", Character.isLetterOrDigit(caracter));
        System.out.printf("Es minúscula: %b%n", Character.isLowerCase(caracter));
        System.out.printf("Es mayúscula: %b%n", Character.isUpperCase(caracter));
        System.out.printf("A mayúscula: %s%n", Character.toUpperCase(caracter));
        System.out.printf("A minúscula: %s%n", Character.toLowerCase(caracter));
    }
}
