package sobrecargametodos;

public class SobrecargaMetodos {

    public static void main(String[] args) {

        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));

        System.out.println("Resultado 2: " + Operaciones.sumar(5, 4.1));

        System.out.println("Resultado 3: " + Operaciones.sumar(7.1, 6));

        /* Al declarar un argumento de tipo Long (no se obtiene un resultado de tipo Long),
        esta por defecto se transforma en un argumento de tipo double (variable que soporta
        valores de tipo Long) ya que tipo long almacena 64 bits y un tipo double también
        almacena 64 bits. */
        System.out.println("Resultado 4: " + Operaciones.sumar(3, 4L));

        /* Las variables se transforman al suiguiente tipo que lo soporte, el argumento 5F (float),
        se transforma a una variable de tipo int, y el argumento 'A' (char) se transforma a una
        variable de tipo int, ya que la variable tipo int soporta estos argumetos. */
        System.out.println("Resultado 4: " + Operaciones.sumar(5F, 'A'));

        /* El resultado es 70 debido a que el valor decimal del caracter 'A' es equivalente a 65,
        y si esta se suma a la variable flotante de valor 5 es igual a 70. */

    }
}
