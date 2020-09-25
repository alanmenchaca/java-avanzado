package manejodearchivos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Escribir datos en un archivo de texto secuencial mediante la clase Formatter.
public class CrearArchivo {

    /* Un objeto Formatter puede enviar datos a varias ubicaciones como podría ser
     * una ventana de símbolo del sistema o un archivo. */
    private static Formatter salida; // envía texto a un archivo.

    public static void main(String[] args) {
        abrirArchivo();
        agregarRegistros();
        cerrarArchivo();
    }

    // abre el archivo clientes.txt
    public static void abrirArchivo() {
        try { /* El constructor recibe un objeto String como argumento, el cual
        contiene el nombre del archivo que incluye su ruta. */
            salida = new Formatter("clientes.txt");
            /* Si el archivo no existe, entonces se creará. Se se abre un archivo
             * existente, s contenido se trunca, y todos los datos en el archivo se
             * descartan. */

        } catch (SecurityException securityException) {
            /* La excepción SecurityException ocurre si el usuario no tiene permisos para
             * escribir datos en el archivo. */
            System.err.println("Permiso de escritura denegado. Terminado");
            System.exit(1); // termina el programa

        } catch (FileNotFoundException fileNotFoundException) {
            /* La excepción tipo FileNotFoundException ocurre si el archivo no existe y no
             * se puede crear uno nuevo. Esta excepción también puede ocurrir si hay un
             *  error al abrir el archivo. */
            System.err.println("Error al abrir el archivo. Termiando");
            /* Un argumento de 0 en el método static System.exit indica la terminación exitosa
             * del programa. Un valor 1 por lo general indica que ocurrió un error. */
            System.exit(1); // termina el programa
        }
    }

    // agrega registros al archivo
    public static void agregarRegistros() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Escriba un número de cuenta, nombre, apellido y saldo.",
                "Para terminar la entrada, escriba el indicador de fin de archivo.");

        // itera hasta encontrar el indicador de fin de archivo.
        while (entrada.hasNext()) {
            try {
                /* Se usa un objeto Scanner para leer los datos del usuario y luego se envían los
                 * datos como un registro usando el objeto Formatter. */
                salida.format("%d %s %s %.2f%n", entrada.nextInt(), entrada.next(),
                        entrada.next(), entrada.nextDouble());

            } catch (FormatterClosedException formatterClosedException) {
                /* Si se cierra el objeto Formatter se lanza una excepción tipo FormatterClosedException. */
                System.err.println("Error al escribir en el archivo. Terminado");
                break;

            } catch (NoSuchElementException elementException) {
                /* Cada método de entrada de Scanner lanza una excepción tipo NoSuchElementException
                 * cuando los datos se encuentran en el formato incorrecto (por ejemplo, un objeto
                 * String cuando se espera un valor int), o cuando no hay más datos que introducir. */
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo.
            }
            System.out.print("? ");
        }
    }

    // cierra el archivo
    public static void cerrarArchivo() {
        /* Se cierra el objeto Formatter y el archivo de salida subyacente, mediante una llamada simple
         * al método close. Si el método close no se llama en forma explicíta, el sistema operativo por
         * lo general cierra el archivo cuando el programa termina de ejecutarse.*/
        if (salida != null) {
            /* Siempre debemos cerrar un archivo en forma explicíta cuando ya no lo necesitamos. */
            salida.close();
        }
    }

}


