package tiposprimitivos;

import java.util.Scanner;

// Conversión de tipos primitivos
public class ConversionTP {

    public static void main(String[] args) {

        // Conversión: cadena de texto a variable de tipo entero.
        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        // Conversión: cadena de texto a variable de punto flotante.
        float valorPi = Float.parseFloat("3.1416");
        System.out.println("age = " + valorPi);

        /* El método .charAt() nos permite tomar un caracter de una cadena
        de texto, seleccionando su número de indíce.*/
        char c = "Hola".charAt(3);
        System.out.println("c = " + c);

        Scanner jum = new Scanner(System.in);

        System.out.println("\nIngresa tu nombre:");
        char character = jum.nextLine().charAt(0);
        System.out.println("Primera letra de tu nombre: " + character);

        // Conversión de datos tipo numericos a cadena de texto (String).
        String edadTexto = String.valueOf(edad);
        /* El método String.valueOf() nos permite convertir cualquier dato
        de tipo primitivo a una cadena de texto. */
        System.out.println("Número en texto: " + edadTexto);

        // Forma distinta de convertir un dato de tipo primitivo a cadena de texto.
        String ageText = "" + edad;

        /* Casting: conversión de una variable tipo short a una variable byte. */
        short value = 10;
        // Casting más operación.
        byte value2 = (byte) (value + 8);
    }
}
