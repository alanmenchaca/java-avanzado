package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;

/**
 * Ejemplo para probar el concepto de JavaDoc
 *
 * @author Alan
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Método que ejecuta la prueba de la clase Aritmetica
     *
     * @param args argumentos de la líne a de comandos
     */
    public static void main(String[] args) {

        int numero = new Aritmetica(3, 4).sumar();

        System.out.println("numero = " + numero);
    }

}
