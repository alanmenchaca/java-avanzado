package javacourse;

public class CaracteresEspeciales {

    public static void main(String[] args) {

        String nombre = "Alan";
        String apellido = "Menchaca";

        // Salto de línea.
        System.out.println("Nueva Línea: \n" + nombre);
        // Tabulador horizontal.
        System.out.println("Tabulador: \t" + nombre);
        // El Retroceso elimina el caracter anterior.
        System.out.println("Retroceso: \b" + nombre);
        // El retorno de carro comienza al principio de la línea.
        System.out.println("Retorno de Carro: \r" + nombre);

        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Doble: \"" + nombre + "\"");

    }
}