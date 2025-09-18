package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String resultado;
    private Contacto nuevocontacto;
    List<Contacto> contactos = new ArrayList<>();

    public void buscarContacto(String apellido) {
        if (contactos == null) {
            return;
        }
        System.out.println("No se ha encontrado el contacto.");
        for (Contacto contacto : contactos) {
            if (contacto.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Contacto encontrado: " + contacto.getNombre()
                        + " " + contacto.getApellido()
                        + ", Teléfono: " + contacto.getTelefono());
                break;


            }
        }
    }

    public void agregarContacto(String nombre, String apellido, String telefono) {
       if (nombre == null || apellido == null || telefono == null) {
           System.out.println("No es posible agregar el contacto, falta alguno de los datos");
        } else {
            nuevocontacto = new Contacto();
            nuevocontacto.setNombre(nombre);
            nuevocontacto.setApellido(apellido);
            nuevocontacto.setTelefono(telefono);
            contactos.add(nuevocontacto);
           System.out.println("Contacto agregado correctamente.");

        }

    }

    public void getContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La lista de contactos està vacìa.");
        }
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }


    }
}