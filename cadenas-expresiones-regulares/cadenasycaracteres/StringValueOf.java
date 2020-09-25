package cadenasycaracteres;

// Métodos valueOf de String.
public class StringValueOf {

    public static void main(String[] args) {

        /* De manera predeterminada, Java trata a las literales enteras como tipo int y a las literales
        *  de punto flotante como tipo double. Si se anexa la letra L a la literal 10000000000 y se anexa
        *  la letra f a la literal 2.5, se indica al compilador que 10000000000 debe tratarse como long y
        *  que 2.5 debe tratarse como float. Se puede usar una L mayúscula o una l minúscula para detonar
        *  una variable de tipo long, y una F mayúscula o una f minúscula para detonar una variable de
        *  tipo float. */

        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorCharacter = 'Z';
        int valorEntero = 7;
        long valorLong = 10000000000L; // el sufijo L indica long.
        float valorFloat = 2.5f; // f indica que 2.5 es un float.
        double valorDouble = 33.333; // no hay sufijo, double es el predeterminado.
        Object refObject = "hola"; // asgina la cadena a una referencia Object.

        System.out.printf("arreglo de valores char = %s%n", String.valueOf(arregloChar));
        System.out.printf("parte del arreglo char = %s%n", String.valueOf(arregloChar, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(valorBoolean));
        System.out.printf("char = %s%n", String.valueOf(valorCharacter));
        System.out.printf("int = %s%n", String.valueOf(valorEntero));
        System.out.printf("long = %s%n", String.valueOf(valorLong));
        System.out.printf("float = %s%n", String.valueOf(valorFloat));
        System.out.printf("double = %s%n", String.valueOf(valorDouble));
        System.out.printf("Object = %s%n", String.valueOf(refObject));
    }
}
