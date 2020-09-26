package enumeraciones;

public class EnumContinentes {

    public static void main(String[] args) {

        // Utilizamos la enúmeracione de países.
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Países en America: " + Continentes.AMERICA.getPaises());
        
        System.out.println("");
        indicarPaises(Continentes.OCEANIA);
        
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void imprimirContinentes(){
        // El método values() nos permite recuperar todos los valores asociados a una enumeración.
        for (Continentes c: Continentes.values()) {
            // Mandamos a llamar el método getPaises() por medio del objeto creado Continentes c.
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + " países.");
        }
        
    }

    public static void indicarPaises(Continentes continentes) {

        switch (continentes) {
            case AFRICA:
                System.out.println("Número de países en " + continentes + ": " + continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("Número de países en " + continentes + ": " + continentes.getPaises());

                break;
            case ASIA:
                System.out.println("Número de países en " + continentes + ": " + continentes.getPaises());

                break;
            case AMERICA:
                System.out.println("Número de países en " + continentes + ": " + continentes.getPaises());

                break;
            case OCEANIA:
                System.out.println("Número de países en " + continentes + ": " + continentes.getPaises());

        }
    }

}
