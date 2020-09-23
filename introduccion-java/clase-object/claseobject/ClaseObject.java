package claseobject;

public class ClaseObject {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan", 2000);
        Empleado empleado2 = new Empleado("Juan", 2000);
        int hash = empleado.hashCode();
        
        System.out.println(empleado.hashCode() == empleado2.hashCode());
        
        System.out.println(empleado.hashCode());
        System.out.println(empleado2.hashCode());
    }
    
}
