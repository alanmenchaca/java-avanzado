package ejemplosobreescritura;

public class EjemploSobreescritura {

    /* La sobreescritura trata basicamente de la modificación de un método desde una clase
 hija un método heredado de la clase padre. */
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Karla", 2000, "Finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
}
