package enumeraciones;

public class EnumDiasSemana {

    public static void main(String[] args) {

        System.out.println("Valor 1: " + Dias.LUNES);

        // Test del día utilizado.
        indicarDia(Dias.MARTES);
    }

    // Método que recibe por parámetro un objeto de la clase instanciable Dias.
    public static void indicarDia(Dias dia) {
        // Switch que recibe un constante de la clase Dias.
        switch (dia) {
            case LUNES:
                System.out.println("Primer día de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana.");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana.");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana.");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana.");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana.");
        }
    }

}
