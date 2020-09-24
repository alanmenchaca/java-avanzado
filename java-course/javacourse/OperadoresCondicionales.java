package javacourse;

public class OperadoresCondicionales {
    // Operadores condicionales en Java
    public static void main(String[] args) {

        int a = 10;
        int valorMinimo = 0, valorMaximo = 10;

        if (a >= valorMinimo && a <= valorMaximo)
            System.out.println("Dentro de Rango");
        else
            System.out.println("Fuera de Rango.");

        boolean vacaciones = true;
        boolean diaDescanso = false;

        if (vacaciones || diaDescanso)
            System.out.println("El padre puede asistir al juego del hijo.");
        else
            System.out.println("Padre ocupado.");
    }
}
