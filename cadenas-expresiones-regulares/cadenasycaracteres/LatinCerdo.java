package cadenasycaracteres;

import java.util.Scanner;

public class LatinCerdo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un enunciado: ");
        String enunciado = entrada.nextLine();

        String[] palabras = enunciado.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int longitudDePalabra = palabra.length();

            char primerCaracter = palabra.charAt(0);
            char ultimoCaracter = palabra.charAt(longitudDePalabra - 1);

            String resultado2 = palabra.replace(primerCaracter, ' ');
            resultado2 += primerCaracter + "ae";

            System.out.print(resultado2);
        }
    }
    
}
