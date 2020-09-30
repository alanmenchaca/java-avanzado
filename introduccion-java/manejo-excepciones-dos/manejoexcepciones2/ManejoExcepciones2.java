package manejoexcepciones2;

import datos.*;
import excepciones.*;

public class ManejoExcepciones2 {

    public static void main(String[] args) {

        IAccesoDatos datos = new ImplementacionSql();
        // cambiamos el estado a simularError = true
        datos.simularError(true);
        ejecutar(datos, "listar");

        // cambiamos el estado a simularError = false
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos, "insertar");
    }

    public static void ejecutar(IAccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                // Procesamos las excepciones de menor a mayor jerarquía 
                datos.listar();
                // Si se van a procesar varias excepciones de la misma jerarquía
                // siempre se debe procesar primero la excepcion de menor jerarquía
                // y posteriormente la de mayor jerarquía.
            } catch (LecturaDatosEx ex) {
                System.out.println("Error lectura: Procesa la excepcion más específica de lectura de datos.");
            } catch (AccesoDatosEx ex) {
                System.out.println("Error Acceso Datos: Procesa la excepcion más generica de acceso a datos.");
            } catch (Exception ex) {
                System.out.println("Error General");
            } finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutará sin importar si hubo error o no.");
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
                // Unicamente procesamos solamente la excepciones de mayor jerarquía.
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso datos: Podemos procesar solo la excepción más generica.");
            } finally {
                System.out.println("Procesar finally es opcional, siempre se ejecutará sin importar si hubo error o no.");
            }
        } else {
            System.out.println("No se proporcionó ninguna accion conocida.");
        }

    }

}
