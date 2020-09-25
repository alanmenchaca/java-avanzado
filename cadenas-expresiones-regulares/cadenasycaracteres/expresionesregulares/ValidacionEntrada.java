package cadenasycaracteres.expresionesregulares;

// Valida la información del usuario mediante expresiones regulares.
public class ValidacionEntrada {

    // valida el primer nombre
    public static boolean validarPrimerNombre(String primerNombre) {
        /* En general, cunado aparece el operador de expresión regular "*" en una
         * expresión regular, la aplicación intenta hacer que concuerden cero o más
         * ocurrencias de la subexpresión que va inmediatamente después de "*". */
        return primerNombre.matches("[A-Z][a-zA-Z]*");
    }

    // valida el apellido
    public static boolean validarApellidoPaterno(String apellidoPaterno) {
        /* "[a-zA-Z]" concuerda con todas las letras mayúsculas y minúsculas
           El rango "[A-z]" concuerda con todas las letras y también concuerda con
           los con los caracteres (como [ y \) que tenga un valor entero entre la
           Z mayúscula y la letra minúscula. */
        return apellidoPaterno.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
        /* La expresión regular para validar el apellido concuerda con cualquier número de
         * letras dividad por espacios, apóstrofes o guiones cortos. */
    }

    // valida la dirección
    public static boolean validarDireccion(String direccion) {
        /* La primera clase de carácter concuerda con cualquier dígito una o más veces (\\d+).
         * Se utilizan dos caracteres \, ya que el carácter \ por lo general inicia una secuencia
         * de escape en una cadena. Por lo tanto, \\d en un objeto String representa al patrón de
         * expresión regular \d. Después concordamos uno o más caracteres de espacio en blanco
         * (\\s+). El carácter "|" concuerda con la expresión a su izquierda o a su derecha. */
        return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // valida la ciudad
    public static boolean validarCiudad(String ciudad) {
        /* El operador "+" intenta hacer que concuerden una o más ocurrencias de la
         * subexpresión que va inmediatamente después de "+". Por lo tanto, "A*" y "A+"
         * concordarán con "AAA" o "A", pero sólo "A*" concordará con una cadena vacía. */
        return ciudad.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // valida el estado
    public static boolean validarEstado(String estado) {
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // valida el código postal
    public static boolean validarCP(String cp) {
        return cp.matches("\\d{5}");
    }

    // \d cualquier dígito                  \D cualquier carácter quue no sea dígito.
    // \w cualquier carácter de palabra     \W cualquier cáracter que no sea de palabra.
    // \s cualquier espacio en blanco       \S cualquier carácter que no sea espacio en blanco.

    // valida el teléfono
    public static boolean validarTelefono(String telefono) {
        return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }

    /* Todos los cuantificadores afectan solamente a la subexpresión que va inmediatamente
     * antes del cuantificador. El cuantificador signo de interrogación (?) concuerda con
     * cero o una ocurrencia de la expresión cuantifica. Un conjunto de llaves que contiene
     * un número ({n}) concuerda exactamente con n ocurrencias de la expresión que cuantifica.*/
}
