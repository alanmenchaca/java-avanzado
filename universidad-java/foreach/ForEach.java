package foreach;

/* El ciclo forEach (for extendido) es una sintaxis resumida, para iterar los elementos 
de un arreglo o colección de datos, es ciclo foreach permite iterar más facilmente los 
elementos de un arreglo o coleeción ya que evita errores al omitir la declaración de 
contadores para iterar el arreglo. */
public class ForEach {

    // El ciclo permite iterar arreglos de cualquier tipo de dato (tipos primitivos, o tipos object).
    public static void main(String[] args) {

        // Arreglo de Personas, con 2 valores (longitud 2).
        Persona[] personas = {new Persona("Juan"), new Persona("Karla")};

        /* La variable tipo object persona, es la variable que recibirá los valores del arreglo 
        de Personas. */
        for (Persona persona : personas) {
            // Acedemo a las variables y/o métodos del objeto.
            String nombre = persona.getNombre();
            System.out.println("Nombre persona: " + nombre);
        }

        System.out.println("");

        int[] edades = {15, 20, 41, 50};
        // Por cada iteración se la asigna un valor a la variable edad.
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }

        /* Si deseamos recorrer por completo el arreglo o la colección de datos es factible 
        utilizar y aprovechar la sintaxis simplificada del ciclo for each. */
    }
}
