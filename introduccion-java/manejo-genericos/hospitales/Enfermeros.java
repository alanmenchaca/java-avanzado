package hospitales;

public class Enfermeros extends Personal {

    private String matricula;
    private double sueldo;

    public Enfermeros(String nombre, String apellido, int edad, double sueldo) {
        super(nombre, apellido, edad, sueldo);

        this.sueldo = sueldo;
        this.matricula = "25836";
    }

    // Siempre que heredes de una clase abstracta debes de sobreescribir todos los métodos
    // abstractos de dicha clase (La clase base) en este caso el unico método abstracto es sueldo().
    @Override 
    public void sueldo() {
        System.out.println("El sueldo del Enfermero es de: " + sueldo + "-");
    }

}
