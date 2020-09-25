package flujosylambdas.streamempleado;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcesarEmpleados {

    public static void main(String[] args) {

        Empleado[] empleados = {
                new Empleado("Jason", "Red", 5000, "TI"),
                new Empleado("Ashley", "Green", 7600, "TI"),
                new Empleado("Matthew", "Indigo", 3587.5, "Ventas"),
                new Empleado("James", "Indigo", 4700.77, "Marketing"),
                new Empleado("Luke", "Indigo", 6200, "TI"),
                new Empleado("Jason", "Blue", 3200, "Ventas"),
                new Empleado("Wendy", "Brown", 4236.4, "Marketing")
        };

        // obtiene vista List de los objetos Empleado
        List<Empleado> lista = Arrays.asList(empleados);

        System.out.println("Lista completa de empleados:");
        lista.stream().forEach(System.out::println);

        // predicado que devuelve true para salarios en el rango $4000-$6000
        Predicate<Empleado> cuatroASeisMil =
                // al definir las lambdas de esta manera se pueden reutilizar varias veces.
                empleado -> (empleado.getSalario() >= 4000 && empleado.getSalario() <= 6000);

        // muestra los empleados con salarios en el rango $4000-$6000 en orden
        // ascendente por salario
        System.out.print("\nEmpleados que ganan $4000-$6000 mensuales ordenados por salario:\n");
        lista.stream()
                /* Se filtra el flujo usando el Predicate llamado CuatroASeisMil*/
                .filter(cuatroASeisMil)
                /* Para especificar un Comparator para los salarios, se utiliza el método static
                 * comparing de la interfaz Comparator. El compilador convierte la referencia al método
                 * Empleado::getSalario que se pasa como argumento en un objeto que implementa a la
                 * interfaz Function. Esta interfaz se usa para extraer un valor de un objeto en
                 * el flujo para usarlo en las comparaciones. */
                .sorted(Comparator.comparing(Empleado::getSalario))
                /* El método comparing devuelve un objeto Comparator que invoca a getSalario en
                 * cada uno de dos objetos Empleado, después devuelve un valor negativo si el
                 * salario del primer Empleado es menor que el del segundo, 0 si son iguales y
                 * un valor positivo si el salario del primer Empleado es mayor que el del segundo.*/
                .forEach(System.out::println);

        System.out.printf("%nPrimer empleado que gana $4000-$6000:%n%s%n",
                lista.stream()
                        .filter(cuatroASeisMil)
                        /* El método findFirst de Stream es una operación terminal de cortocircuito que
                         * procesa la canalización del flujo y termina el procesamiento tan pronto como
                         * se encuentra el primer objeto de la canalización del flujo. */
                        .findFirst()
                        /* El método findFirst devuelve un objeto Optional (en este caso un Optional<Empleado>)
                         * que contiene el objeto que se encontró, en caso de haberlo. La llamada al método get
                         * de Optional devuelve el objeto Empleado que coincide en la busqueda. Incluso aunque
                         * el flujo contuviera millones de objetos Empleado, la operación filter se realizaría
                         * sólo hasta encontrar la coincidencia. */
                        .get());

        // Ordenamiento de objetos Empleado según varios campos
        /* A porPrimerNombre se le asigna la referencia a un método para el método de instancia
         * getPrimerNombre de Empleado. */
        Function<Empleado, String> porPrimerNombre = Empleado::getPrimerNombre;
        /* A porApellidoPaterno se le asigna la referencia a un método para el método de instancia
         * getApellidoPaterno de Empleado. */
        Function<Empleado, String> porApellidoPaterno = Empleado::getApellidoPaterno;

        /* Se usa el método comparing de Comparator para crear un Comparator que invoca a Function
         * porApellidoPaterno en un Empleado para obtener su apellido paterno. En el Comparator
         * resultante, se invoca al método thenComparing de Comparator para crear un objeto Comparator
         * que primero compara a los objetos Empleado por apellido y, si los apellidos son iguales,
         * los compara por nombre. */
        Comparator<Empleado> apellidoLuegoNombre = Comparator.comparing(porApellidoPaterno)
                .thenComparing(porPrimerNombre);

        // ordena empleados por apellido paterno y luego por primer nombre
        System.out.print("\nEmpleados en orden ascendente por apellido y luego por nombre:\n");

        // ordena empleados en forma descendente por apellido, luego por nombre
        lista.stream()
                .sorted(apellidoLuegoNombre)
                .forEach(System.out::println);
        System.out.print("\nEmpleados en orden descendente por apellido y luego por nombre:\n");
        lista.stream()
                .sorted(apellidoLuegoNombre.reversed())
                .forEach(System.out::println);

        // Asociación de objetos Empleado a objetos String con apellidos únicos
        System.out.print("\nApellidos de Empleados únicos:\n");
        /* En este stream se muestra como asignar objetos de un tipo (Empleado) a objetos de un
         * tipo diferente (String). */
        lista.stream()
                /* Se asigna los objetos Empleado a sus apellidos mediante la referencia al método
                 * de instancia Empleados::getApellidoPaterno con el argumento Function del método
                 * map. El resultado es un Stream<String>. */
                .map(Empleado::getApellidoPaterno)
                /* Se invoca el método distinct de Stream en el Stream<String> para eliminar los
                 * objetos String duplicados en un Stream<String>. */
                .distinct()
                // se ordenan los apellidos unicos
                .sorted()
                /* Se realiza una operación terminal forEach que procesa la canalización de flujo
                 * y muestra en pantalla los apellidos únicos en orden. */
                .forEach(System.out::println);

        System.out.print("\nNombres de empleados en orden por apellido y luego por nombre:\n");
        /* Se ordenan los objetos Empleados por apellido y luego por nombre; después se asignan (map)
         * los objetos Empleado a los objetos String con el método de instancia getNombre de Empleado
         * y se muestran los nombres ordenados en una operación terminal forEach. */
        lista.stream()
                .sorted(apellidoLuegoNombre)
                .map(Empleado::getNombre)
                .forEach(System.out::println);

        // agrupa elementos por departamento
        System.out.print("\nEmpleados por departamento:\n");
        Map<String, List<Empleado>> agrupadoPorDepartamento = lista.stream()
                /* Se usa el método collect de Stream para agrupar los objetos Empleados por departamento.
                 * El argumento del método collect es un Collector que especifica cómo resumir los datos
                 * en un formato útil. */
                .collect(Collectors.groupingBy(Empleado::getDepartamento));
        /* Se usa el método Collector devuelto por el método static groupingBy de Collectors, el
         * cual recibe un objeto Function que clasifica los objetos en el flujo; los valores devueltos
         * para esta función se usa como las claves en un objeto Map. Los valores correspondientes de
         * manera predeterminada son objetos List que contienen los elementos del flujo en una categoría
         * dada. Cuando se usa el método collect con este Collector, el resultado es un Map<String, List<Empleado>>
         * en donde cada clave String es un departamento y cada List<Empleado> contiene los objetos
         * Empleados en ese departamento. */

        // El método forEach de Map realiza una operación sobre cada uno de los pares clave-valor del objeto Map.
        agrupadoPorDepartamento.forEach(
                (departamento, empleadosEnDepartamento) -> {
                    System.out.println(departamento);
                    empleadosEnDepartamento.forEach(
                            empleado -> System.out.printf(" %s%n", empleado));
                });

        // Conteo del número de objetos Empledo en cada departamento.
        System.out.print("\nConteo de empleados por departamento:\n");
        /* Se produce un Map<String, Long> en donde cada clave String es el nombre de un departamento y
         * el valor Long correspondiente es el número de objetos Empleados en ese departamento. */
        Map<String, Long> conteoEmpleadosPorDepartamento = lista.stream()
                /* Usamos una versión del método static groupingBy de Collectors que recibe dos
                 * argumentos: el primero es un objeto Function que clasifica los objetos en el flujo y
                 * el segundo es otro Collector (conocido como el Collector de flujo descendente)*/
                .collect(Collectors.groupingBy(Empleado::getDepartamento,
                        /* Usamos el método static counting de Collectors como el tercer argumento, este
                         * método devuelve un Collector que cuenta el número de objetos en una clasificación
                         * dada, en vez de recolectarlos en un objeto List. */
                        TreeMap::new, Collectors.counting()));

        conteoEmpleadosPorDepartamento.forEach(
                (departamento, conteo) -> System.out.printf("%s tiene %d empleado(s)%n", departamento, conteo));

        // suma de los salarios de empleados con el método sum de DoubleStream
        System.out.printf("%nSuma de los salarios de los empleados (mediante el método sum): " +
                "%.2f%n", lista.stream()
                .mapToDouble(Empleado::getSalario)
                .sum());

        // calcula la suma de los salarios de los empleados con el método reduce de Stream
        System.out.printf("Suma de los salarios de los empleados (mediante el método reduce): " +
                "%.2f%n", lista.stream()
                .mapToDouble(Empleado::getSalario)
                .reduce(0, (valor1, valor2) -> valor1 + valor2));

        // promedio de los salarios de empleados con el método average de DoubleStream
        System.out.printf("Promedio de los salarios de los empleados: %.2f%n", lista.stream()
                .mapToDouble(Empleado::getSalario)
                .average().getAsDouble());
    }
}
