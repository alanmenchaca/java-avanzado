package ejemploconversionobjetos;

public class EjemploConversionObjetos { 

    public static void main(String[] args) {

        // Objeto de más alta jerarquía.
        Empleado empleado;
        /* Asignamos una referencia de un objeto de menor jerarquia,
        en el Upcasting, no hay necesidad de una notación especial. */
        // TipoEscritura.CLASICO funciona como referencia de la clase TipoEscritura.
        empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);

        /* Si quicieramos acceder al detalle de la clase Escritor
        no es posible, ya que estas características no están en común
        entre todas las clases de la jerarquía de clases.
        No es posible acceder al método empleado.getTipoDeEscrituraEnTexto(). */
        // Imprimimos los detalles en un método generico.
        imprimirDetalles(empleado);

        // Podemos hacer los mimso en la clase Gerente.
        // El Upcasting no requiere de sintaxis especial.
        empleado = new Gerente("Laura", 18000, "Sistemas");

        /* Si queremos acceder directo por la variable empleado al detalle del
        objeto Gerente no es posible, se pierde el acceso al método
        de la clase Gerente empleado.getDepartamento(). */
        // Utilizamos el mismo método para imprimir los detalles.
        imprimirDetalles(empleado);
    }

    public static void imprimirDetalles(Empleado empleado) {

        /* Las variables definidas dentro de un método son variables que se depositan
        dentro de la memoria stack, y debido a que no es un atributo de la clase es
        necesario inicializarla con un valor (es necesario inicializarla para que el 
        compilador no marque ningún error). */
        String resultado = null;

        /* Imprimir detalles es general para todos ya que es por polimorfismo
        no se necesita de ninguna conversión. */
        System.out.println("Detalles: " + empleado.obtenerDetalles());

        // Para los detalles de cada clase debemos  hacer un Downcasting.
        if (empleado instanceof Escritor) {

            // Convertimos el objeto al tipo inferior deseado (Downcasting).
            Escritor escritor = (Escritor) empleado;
            // Finalmente podemos acceder a los métodos de la clase Escritor.
            resultado = ((Escritor) empleado).getTipoDeEscrituraEnTexto();

            // Otra forma de hacer la conversión en la misma línea de código.
            /* Esto es muy común en encontrarlo en Java para
            evitar la creación de variables inecesarias. */
            resultado = ((Escritor) empleado).tipoEscritura.getDescripcion();
            /* Realiza un Downcasting (es como si definieramos una nueva variable
            del tipo Escritor y utilizamos el objeto tipoEscritura e invocamos
            su método getDescripción(). */

            System.out.println("resultado tipoEscritura: " + resultado);

            /* Comprobamos si la variable empleado está apuntando a una
            referencia de tipo Gerente. */
        } else if (empleado instanceof Gerente) {
            /* Hacemos el Downcasting en la misma línea de código y nos
            ahorramos una variable. */
            resultado = ((Gerente) empleado).getDepartamento();

            System.out.println("Departamento: " + resultado);
        }
    }
  
    /*Al hacer una conversión de un tipo objeto inferior en la jerarquía de clases a un tipo
    superior, se conoce como Upcasting (conversión hacía arriba).

    Cuando se asigna una referencia de una clase de menor jerarquía a una variable tipo
    object de mayor jerarquía (Upcasting) ya no es posible acceder a los métodos y atributos
    de la clase derivada (solo están disponibles los métodos de la clase base).

    Para acceder a los métodos y propiedades de la subclase tendremos que realizar una
    conversión de la variable de mayor jerarquía a una variable de menor jerarquía (Downcasting).
 
    Al realizar una conversión de un tipo objeto superior a un tipo objeto de tipo
    inferior, se conoce como Downcasting (conversión hacía abajo).

    Sólo es posible hacer Upcasting y Downcasting dentro de la jerarquía de herencia
    del objeto. */
}
