package manejodearchivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// Clase File utilizada para obtener información sobre archivos y directorios.
public class InfoArchivosYDirectorios {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el nombre del archivo o directorio:");

        /* Se introduc el nombre del archivo o directorio y se pasa al método static get de Paths,
         * que convierte el objeto String en un objeto Path. */
        Path ruta = Paths.get(entrada.nextLine());

        /* Se invoca al método exists de File, el cual recibe un objeto Path y determina si el nombre
         * introducido por el usuario existe (ya sea como archivo o directorio) en el disco. */
        if (Files.exists(ruta)) {
            // mostrar información de archivo (o directorio).

            // obtiene el nombre String del archivo o directorio sin información sobre la ubiación.
            System.out.printf("%n%n%s existe%n", ruta.getFileName());
            /* recibe un objeto Path y devuelve un boolean que indica si ese objeto Path representa
             * un directorio en el disco. */
            System.out.printf("%s un directorio%n", Files.isDirectory(ruta) ? "Es" : "No es");
            /* devuelve un boolean que inidica si es objeto Path representa una ruta absoluta a un
             * archivo o directorio. */
            System.out.printf("%s una ruta absoluta%n", ruta.isAbsolute() ? "Es" : "No es");
            // recibe un objeto Path e indica cuándo fue la última vez que se modificó el archivo.
            System.out.printf("Fecha de última modificación: %s%n", Files.getLastModifiedTime(ruta));
            /* recibe un objeto Path y devuelve un long que representa el número de bytes en el archivo
            o directorio. Para los directorios, el valor devuelto es específico de la plataforma. */
            System.out.printf("Tamaño: %s bytes%n", Files.size(ruta));
            /* devuelve un objeto String (invoca al método toString de manera implícita) que representa
             * el objeto Path. */
            System.out.printf("Ruta: %s%n", ruta);
            /* convierte el objeto Path con el que se invoca en una ruta absoluta. */
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());

            // imprime en pantalla el listado del directorio.
            if (Files.isDirectory(ruta)) {

                // objeto para iterar a través del contenido de un directorio.
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for (Path path : flujoDirectorio) {
                    System.out.println(path);
                }
            }
            // no es archivo o directorio, imprimir en pantalla mensaje de error.
        } else {
            System.out.printf("%s no existe", ruta);
        }

    }
}
