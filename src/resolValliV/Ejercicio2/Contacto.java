package resolValliV.Ejercicio2;

public class Contacto {
    private String nombre;
    private int numeroTelefono;

    public Contacto(String nombre, int numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return numeroTelefono == contacto.numeroTelefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + numeroTelefono;
    }

}
