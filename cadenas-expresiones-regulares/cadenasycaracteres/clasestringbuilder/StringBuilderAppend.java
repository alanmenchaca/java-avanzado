package cadenasycaracteres.clasestringbuilder;

public class StringBuilderAppend {

    public static void main(String[] args) {

        Object refObjecto = "hola";
        String cadena = "adios";
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 10000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;

        StringBuilder ultimoBuffer = new StringBuilder("ultimo buffer");
        StringBuilder buffer = new StringBuilder();

        /* La clase StringBuilder proporciona métodos append sobrecargados para permitir que
         * se agreguen valores de diversos tipos al final de un objeto StringBuilder. El método
         * append recibe un argumento, lo convierte en una cadena y lo anexa al objeto StringBuilder. */
        buffer.append(refObjecto).
                append("\n")
                .append(cadena)
                .append("\n")
                .append(arregloChar)
                .append("\n")
                .append(arregloChar, 0, 3)
                .append("\n")
                .append(valorBoolean)
                .append("\n")
                .append(valorChar)
                .append("\n")
                .append(valorInt)
                .append("\n")
                .append(valorLong)
                .append("\n")
                .append(valorFloat)
                .append("\n")
                .append(valorDouble)
                .append("\n")
                .append(ultimoBuffer);

        /* El método toString de StringBuilder devuelve el contenido del objeto,
         * como un objeto String (puede invocarse el método toString de manera implícita). */
        System.out.printf("El buffer contiene:%n%s%n", buffer.toString());

    }
}
