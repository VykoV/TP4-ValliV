package resolValliV.Ejercicio2;

public class AgendaDeContacto {
    private Contacto[] contactos;
    private int max;
    private int cantidadContactos;

    public AgendaDeContacto(int cantidadContactos) {
        this.contactos = new Contacto[cantidadContactos];
        this.max = cantidadContactos;
    }

    public AgendaDeContacto() {
        this(10);
    }

    public void aniadirContacto(Contacto contac) {
        if (agendaLlena()) {
            System.out.println("La agenda esta llena");
        } else if (existeContacto(contac)) {
            System.out.println("Ya existe un contacto");
        } else {
            contactos[cantidadContactos] = contac;
            cantidadContactos++;
            System.out.println("Contacto se agrego de forma correcta");
        }
    }

    public boolean existeContacto(Contacto contac) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].equals(contac)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        if (cantidadContactos == 0) {
            System.out.println("La agenda esta vacia");
        } else {
            for (int i = 0; i < cantidadContactos; i++) {
                System.out.println(contactos[i]);
            }
        }
    }

    public void buscaContacto(String nombre) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nro de telefono: " + contactos[i].getNumeroTelefono());
                return;
            }
        }
        System.out.println("No existe el nro de telefono");
    }

    public void eliminarContacto(Contacto contac) {
        for (int i = 0; i < cantidadContactos; i++) {
            if (contactos[i].equals(contac)) {
                for (int j = i; j < cantidadContactos - 1; j++) {
                    contactos[j] = contactos[j + 1];
                }
                contactos[cantidadContactos - 1] = null;
                cantidadContactos--;
                System.out.println("El contacto ha sido eliminado correctamente");
                return;
            }
        }
        System.out.println("El contacto no se ha encontrado");
    }

    public boolean agendaLlena() {
        return cantidadContactos >= max;
    }

    public int espacioLibre() {
        return max - cantidadContactos;
    }
}
