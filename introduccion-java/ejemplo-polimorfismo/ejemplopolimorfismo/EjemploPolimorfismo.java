package ejemplopolimorfismo;

/* Para aplicar el concepto de polimorfismo es necesario apoyarnos de una jerarquía de clases, y
utilizar un tipo de datos que pueda almacenar referencias de objetos en la jerarquía de clases
deseada. */
public class EjemploPolimorfismo {

    // El polimorfismo es la habilidad de ejecutar métodos sintácticamente iguales en tipos distintos.
    public static void main(String[] args) {

        Empleado emp = new Empleado("Juan", 1000);
        imprimirDetalles(emp);

        // Se ejecuta el método de tipo al que apunta en tiempo de ejecución.
        Empleado ger = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(ger);
    }

    /* Creamos un método llamado imprimirDetalles(), el método recibe una referencia de la variable 
    de tipo Empleado. */
    public static void imprimirDetalles(Empleado emp) {
        /* El tipo que recibe el método es de tipo padre (Empleado), sin embargo al momento de
        ejecutar el método, se ejecuta el hijo (Gerente) eso es polimorfismo, multiples formas
        en tiempo de ejecución. */
        System.out.println(emp.obtenerDetalles());
    }
}
