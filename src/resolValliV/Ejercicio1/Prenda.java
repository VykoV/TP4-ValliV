package resolValliV.Ejercicio1;

public class Prenda {
    private String tipoPrenda;
    private double precioBase;
    private String talle;

    public Prenda(String tipoPrenda, double precioBase, String talle) {
        this.tipoPrenda = tipoPrenda;
        this.precioBase = precioBase;
        this.talle = talle;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTalle() {
        return talle;
    }

    public static void mostrarCatalogo(Prenda[] catalogo){
        System.out.println("¿Que producto desea comprar?");
        for (int i=0; i<catalogo.length; i++) {
            System.out.println(i+1 + ". " + catalogo[i].tipoPrenda + " Talle: " + catalogo[i].talle + " → $" + catalogo[i].precioBase);
        }
    }

    public static void mostrarInformacion(Prenda[] catalogo, int opcion1) {
        System.out.println(" La prenda elegida" +
                "\nTipo : " + catalogo[opcion1].getTipoPrenda() +
                "\nTalle: " + catalogo[opcion1].getTalle() +
                "\nPrecio Base: " + catalogo[opcion1].getPrecioBase()
        );

    }

}
