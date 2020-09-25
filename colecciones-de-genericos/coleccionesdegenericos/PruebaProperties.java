package coleccionesdegenericos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PruebaProperties {

    public static void main(String[] args) {

        Properties tabla = new Properties();

        // establece las propiedades
        tabla.setProperty("color", "azul");
        tabla.setProperty("anchura", "200");

        System.out.println("Despues de establecer propiedades.");
        listarPropiedades(tabla);

        // reemplaza el valor de una propiedad
        tabla.setProperty("color", "rojo");

        System.out.println("Despues de reemplazar propiedades");
        listarPropiedades(tabla);
        guardarPropiedades(tabla);

        // vacía la tabla
        tabla.clear();

        System.out.println("Despues de borrar las propiedades");
        listarPropiedades(tabla);
        cargarPropiedades(tabla);

        /* Se llama al método getProperty de Properties para localizar el valor asociado
         * con la clave especificada. Si la clave no se encuentra en este objeto Properties,
         * getProperties devuelve null.*/
        Object valor = tabla.getProperty("color");

        // comprueba si el valor está en la tabla
        if (valor != null) {
            System.out.printf("El valor de la propiedad color es %s%n", valor);
        } else {
            System.out.println("La propiedad color no está en la tabla.");
        }
    }

    // guarda las propiedades en un archivo
    private static void guardarPropiedades(Properties props) {

        try (FileOutputStream salida = new FileOutputStream("props.dat")) {
            /* Se hace una llamada al método store de Properties para guardar el contenido
             * del objeto Properties en el objeto OutputStrem especificado como el primer
             * argumento (en este caso FileOutputStream). */
            props.store(salida, "Propiedades de ejemplo");
            System.out.println("Depues de guardar las propiedades");
            listarPropiedades(props);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // carga las propiedades de un archivo
    public static void cargarPropiedades(Properties props) {
        // carga el contenido de la tabla
        try (FileInputStream entrada = new FileInputStream("props.dat")) {
            /* Se hace una llamada al método load de Properties para restaurar el contenido
             * del objeto Properties a partir del objeto InputStream especificado como el primer
             * argumento (en este caso, un objeto FileInputStream). */
            props.load(entrada);
            System.out.println("Despues de cargar las propiedades");
            listarPropiedades(props);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // imprime los valores de las propiedades
    public static void listarPropiedades(Properties props) {
        // obtiene los nombres de las propiedades
        Set<Object> claves = props.keySet();

        for (Object clave : claves) {
            System.out.printf("%s\t%s%n", clave, props.getProperty((String) clave));
        }

        System.out.println();
    }
}
