package palabrafinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {

        // Modificar un atributo final,no es posible.
        // ClaseFinal.VAR_PRIMITIVO = 23;

        // Modificar la referencia de un atributo de tipo Object, no es posible.
        // ClaseFinal.Var.PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre()); }

}
