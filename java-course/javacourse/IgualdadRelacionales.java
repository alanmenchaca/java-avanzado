package javacourse;

public class IgualdadRelacionales {
    // Operadores de igualdad y relacionales en Java
    public static void main(String[] args) {

        int a = 3, b = 3;
        boolean c = (a != b);
        System.out.println("c = " + c);

        String d = "Hola", e = "Hola";
        boolean f = d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a <= b);
        System.out.println("g = " + g);

        if (a % 2 != 0)
            System.out.println("Número impar");
        else
            System.out.println("Número par");
    }
}
