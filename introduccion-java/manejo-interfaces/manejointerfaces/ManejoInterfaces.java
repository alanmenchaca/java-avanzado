package manejointerfaces;

import datos.IAccesoDatos;
import datos.ImplementacionOracle;
import datos.ImplementacionSql;

public class ManejoInterfaces {

    public static void main(String[] args) {

        IAccesoDatos oracle = new ImplementacionOracle();
        ejecutar(oracle, "listar");
        ejecutar(oracle, "insertar");

        System.out.println("");
        IAccesoDatos mysql = new ImplementacionSql();
        ejecutar(mysql, "listar");
        ejecutar(mysql, "insertar");
    }

    private static void ejecutar(IAccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listar();
        } else if ("insertar".equals(accion)) {
            datos.insertar();
        }
    }

}
