package manejodearchivos;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Este programa lee un archivo de texto y muestra cada registro.
public class LeerArchivoTexto {

    private static Scanner entrada;

    // Leer datos de un archivo de texto de acceso secuencial.
    public static void main(String[] args) {
        abrirArchivo();
        leerRegistros();
        cerrarArchivo();
    }

    // abrir el archivo clientes.txt
    public static void abrirArchivo() {
        try {
            entrada = new Scanner(Paths.get("clientes.txt"));

        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo. Terminado.");
            System.exit(1);
        }
    }

    // leer registro del archivo
    public static void leerRegistros() {
        System.out.printf("%-8s%-15s%-11s%7s%n", "Cuenta", "Primer nombre",
                "Apellido paterno", "Saldo");

        try {
            while (entrada.hasNext()) { // mientras haya mas que leer
                // muestra el contenido del registro
                System.out.printf("%-8d%-15s%-11s%12.2f%n", entrada.nextInt(),
                        entrada.next(), entrada.next(), entrada.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no está bien formado. Terminado.");

        } catch (IllegalStateException stateException) {
            // Se ejecuta si el scanner es cerrado
            System.err.println("Error al leer del archivo. Terminado.");
        }
    }

    // cierra el archivo y termina la aplicación
    public static void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}




