package sobrecargaconstructores;

public class SobrecargaConstructores {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Lilia", 22);
        System.out.println("persona1 = " + persona1);

        Empleado empleado1 = new Empleado("Pedro", 33, 18000);
        System.out.println("empleado1 = " + empleado1);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Hola Mundo");
        }
    }
}
