package javacourse;

public class OperadorTernario {

    public static void main(String[] args) {

        int numero = 3;

        // Operador Ternario
        String resultado = (numero % 2 != 0) ? "Número impar" : "Número par";
        System.out.println("resultado = " + resultado);

        boolean par = (numero % 2 == 0) ? true : false;
        if (par)
            System.out.println("Número par");
        else
            System.out.println("Número impar");

    }
}
