import Agenda.Agenda;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarContacto("Contacto", "Prueba", "1234567");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("AGENDA DE CONTACTOS");
            System.out.println("===================");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar todos los contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = sc.next();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = sc.next();

                    agenda.agregarContacto(nombre, apellido, telefono);

                    break;

                case 2:
                    System.out.println("LISTA DE CONTACTOS");
                    System.out.println("==================");
                    agenda.getContactos();
                    break;

                case 3:
                    System.out.print("Ingrese el apellido a buscar: ");
                    String apellidoBuscar = sc.next();
                    agenda.buscarContacto(apellidoBuscar);
                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

       } while (opcion != 4);

        sc.close();
    }
}