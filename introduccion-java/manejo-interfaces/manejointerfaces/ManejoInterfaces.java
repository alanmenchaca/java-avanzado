package manejointerfaces;

import datos.AccesoDatos;
import datos.ImplementacionOracle;
import datos.ImplementacionMySql;

public class ManejoInterfaces {

    public static void main(String[] args) {

        AccesoDatos oracle = new ImplementacionOracle();
        ejecutar(oracle, "listar");
        ejecutar(oracle, "insertar");

        System.out.println("");
        AccesoDatos mysql = new ImplementacionMySql();
        ejecutar(mysql, "listar");
        ejecutar(mysql, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listar();
        } else if ("insertar".equals(accion)) {
            datos.insertar();
        }
    }

}
