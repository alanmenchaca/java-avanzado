package tiposprimitivos;

public class TiposPrimitivosBoolean {

    public static void main(String[] args) {
        // Tipos primitivos del tipo Boolean.

        System.out.println("True tipo boolean: " + Boolean.TRUE);
        System.out.println("False tipo boolean: " + Boolean.FALSE);
        System.out.println();

        boolean booleanVar = false;

        if (booleanVar)
            System.out.println("La variable contiene un valor verdadero.");
        else
            System.out.println("La variable contiene un valor falso.");

        System.out.println();
        int edad = 23;
        boolean adulto = edad >= 18;

        if (adulto)
            System.out.println("Eres mayor de edad, puede pasar.");
        else
            System.out.println("Eres menor de edad, no puedes pasar.");
    }

}
