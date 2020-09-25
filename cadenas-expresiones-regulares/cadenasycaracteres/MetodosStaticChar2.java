package cadenasycaracteres;

import java.util.Scanner;

// Métodos de conversión estáticos de la clase Character.
public class MetodosStaticChar2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba una raíz: ");
        int raiz = scanner.nextInt();

        // obtiene la selección del usuario
        System.out.printf("Seleccione una opción:%n1 -- %s%n2 -- %s%n"
                , "Convertir digito a caracter", "Convertir caracter a digito");
        int opcion = scanner.nextInt();

        /* Los métodos static digit y forDigit de Character, convierten caracteres a dígitos y
         * dígitos a caracteres respectivamente, en distintos sistemas numéricos. Los
         * sistemas númericos comunes son el decimal (base 10), octual (base 8), hexadecimal
         * base 16) y binario (base 2). La base de un número se conoce también como su raíz.*/

        switch (opcion) {
            case 1:
                System.out.print("Escriba un digito: ");
                int digito = scanner.nextInt();
                /* El método forDigit convierte el entero digito en un carácter del sistema
                 * númerico especificado por el entero raíz (la base del número).*/
                System.out.printf("Convertir digito a caracter: %s%n",
                        Character.forDigit(digito, raiz));
                break;

            case 2:
                System.out.print("Escriba un caracter: ");
                char caracter = scanner.next().charAt(0);
                /* El método digit convierte la variable caracter en un entero del sistema
                 * númerico específicado por el entero raíz (la base del número). */
                System.out.printf("Convertir caracter a digito: %s%n",
                        Character.digit(caracter, raiz));
                break;
        }
    }
}
