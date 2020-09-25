package cadenasycaracteres.clasestringbuilder;

// Métodos length, setLength, capacity y ensureCapacity de StringBuilder.
public class StringBuilderCapLen {

    public static void main(String[] args) {

        /* El constructor de StringBuilder recibe un argumento String inicializa la capacidad
         * con la longitud de la cadena con la longitud de la cadena que se le pasa como argumento,
         * más 16. */
        StringBuilder buffer = new StringBuilder("Hola, ¿Cómo estas?");

        System.out.printf("buffer = %s%nlongiutd = %d%ncapacidad = %d%n%n",
                buffer.toString(), buffer.length(), buffer.capacity());

        /* El método ensureCapacity expande la capacidad del objeto StringBuilder en un mínimo
         * de 75 caracteres. */
        buffer.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d%n%n", buffer.capacity());


        /* Si la longitud especificada es menor que el número actual de caracteres en el objeto
         * StringBuilder, el búfer se trunca a la longitud especificada (es decir, los caracteres en el
         * objeto StringBuilder que excedan la longitud especificada serán descartados).*/
        buffer.setLength(10);
        System.out.printf("Nueva Longitud = %d%nbuffer = %s%n",
                buffer.length(), buffer.toString());

        /* Nota: si un objeto StringBuilder va a aumentar su tamaño en forma considerable (quizá
         * varias veces), establecer desde el principio su capacidad a un nivel alto incrementará
         * el rendimiento.*/
    }
}
