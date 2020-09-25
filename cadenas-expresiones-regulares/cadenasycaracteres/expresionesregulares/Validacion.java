package cadenasycaracteres.expresionesregulares;

import java.util.Scanner;

// Recibe y valida la información del usuario mediante la clase ValidacionEntrada.
public class Validacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el primer nombre: ");
        String primerNombre = scanner.nextLine();

        System.out.print("Escriba el apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Escriba la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Escriba la ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Escriba el estado: ");
        String estado = scanner.nextLine();

        System.out.print("Escriba el código postal: ");
        String cp = scanner.nextLine();

        System.out.print("Escriba el teléfono: ");
        String telefono = scanner.nextLine();

        // valida la entrada del usuario y muestra mensaje de error
        System.out.println("\nValidar resultado: ");

        if (!ValidacionEntrada.validarPrimerNombre(primerNombre)) {
            System.out.println("Primer nombre invalido!!");
        } else if (!ValidacionEntrada.validarApellidoPaterno(apellidoPaterno)) {
            System.out.println("Apellido paterno invalido!!");
        } else if (!ValidacionEntrada.validarDireccion(direccion)) {
            System.out.println("Dirección invalida!!");
        } else if (!ValidacionEntrada.validarCiudad(ciudad)){
            System.out.println("Ciudad invalida!!");
        } else if (!ValidacionEntrada.validarEstado(estado)){
            System.out.println("Estado invalido!!");
        } else if (!ValidacionEntrada.validarCP(cp)){
            System.out.println("Código postal invalido!!");
        } else if (!ValidacionEntrada.validarTelefono(telefono)){
            System.out.println("Número telefonico invalido!!");
        } else {
            System.out.println("La entrada es valida. Gracias.");
        }
    }
}
