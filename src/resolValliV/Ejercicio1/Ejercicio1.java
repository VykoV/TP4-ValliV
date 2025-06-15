package resolValliV.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        Prenda[] catalogo = new Prenda[3];
        catalogo[0] = new Prenda("Pantalon cargo", 12000, "M");
        catalogo[1] = new Prenda("Zapatilla Nike", 30000, "40");
        catalogo[2] = new Prenda("Camiseta de boca", 100000, "L");

        Prenda.mostrarCatalogo(catalogo);
        int opcion1 = scanner.nextInt() - 1;

        Compra.metodoDePagoUtil();
        int opcion2 = scanner.nextInt();

        int opcion3=0;
        if (opcion2 == 2) {
            Compra.cuotas();
            opcion3 = scanner.nextInt();
        }

        Compra.tieneCupon();
        int opcion4 = scanner.nextInt();

        Compra producto = new Compra(catalogo[opcion1], opcion2, opcion3, opcion4);

        Prenda.mostrarInformacion(catalogo, opcion1);
        producto.pagoElegido();

        if(opcion2==1){
            double precioFinal= producto.compraEfectivo();
            System.out.println( "Precio Final: $" + precioFinal);
        }else{
            double precioFilalC = producto.cuotasPB();
            System.out.println("Precio Final: $" + precioFilalC);
        }

    }
}
