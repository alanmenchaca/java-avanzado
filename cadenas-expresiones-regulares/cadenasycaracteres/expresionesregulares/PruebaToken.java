package cadenasycaracteres.expresionesregulares;

import java.util.Scanner;

// Uso de un objeto StringTokenizer para descomponer objetos String en tokens.
public class PruebaToken {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba un enunciado y oprima Intro:");
        String enunciado = entrada.nextLine();

        // procesa el enunciado del usuario
        String[] tokens = enunciado.split(" ");
        System.out.printf("Número de elementos: %d%nLos tokens son:%n", tokens.length);

        /* Los tokens descomponen instrucciones en piezas individuales tales como palabras
         * clave, identificadores, operadores y además elementos de un lenguaje de programación,
         * los tokens se separan unos de otros mediante delimitadores, que por lo general son
         * caracteres de espacio en blanco tales como espacios, tabuladores, nuevas líneas y
         * retornos de carro. */

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

