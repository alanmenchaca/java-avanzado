package palabrareturn;

public class PalabraReturnClases {

    public static void main(String[] args) {

        Suma s = crearObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("resultado = " + resultado);
    }

    public static Suma crearObjetoSuma() {
        Suma s = new Suma(3, 4);
        return s;
    }
}

class Suma {
    int a;
    int b;

    Suma(int a, int b) {
        this.a = b;
        this.b = b;
    }

}
