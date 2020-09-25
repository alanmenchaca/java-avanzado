package sobrecargametodos;

public class Operaciones {

    // Método sumar
    public static int sumar(int a, int b) {
        System.out.println("Método sumar(int, int)");
        return a + b;
    }

    // Sobrecarga de método sumar
    public static double sumar(double a, double b) {
        System.out.println("Método sumar(double, double)");
        return a + b;
    }

    public static double sumar(int a, double b) {
        System.out.println("Método sumar(int, double)");
        return a + b;
    }

    public static double sumar(double a, int b) {
        System.out.println("Método sumar(double, sumar)");
        return a + b;
    }
}
