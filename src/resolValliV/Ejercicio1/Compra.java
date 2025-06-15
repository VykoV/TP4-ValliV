package resolValliV.Ejercicio1;

public class Compra {
    private Prenda prenda;
    private int metodoPago;
    private int cuota;
    private int cupon;

    public Compra(Prenda prenda, int metodoPago, int cuota, int cupon) {
        this.metodoPago = metodoPago;
        this.cuota = cuota;
        this.cupon = cupon;
        this.prenda = prenda;
    }

    public static void metodoDePagoUtil (){
        System.out.println("Que metodo de pago utilizara?" +
                "\n1.Efectivo" +
                "\n2.Credito");
    }
    public static void cuotas(){
        System.out.println("En cuantas cuotas?" +
                "1. Más de 3 cuotas: recargo del 5%\n" +
                "2. Más de 6 cuotas: recargo del 8%\n" +
                "3. Más de 12 cuotas: recargo del 12%");
    }
    public static void tieneCupon(){
        System.out.println("Tiene un cupon?" + "\n1. Si" + "\n2. No");
    }

    public void pagoElegido(){
        if(metodoPago==1){
            System.out.println("Metodo de pago elegido: Efectivo");
        }else{
            System.out.println("Metodo de pago elegido: Credito");
            if (cuota==1 || cuota==2){
                System.out.println("\nCantidad de cuotas: " + cuota*3);
            }else{
                System.out.println("\nCantidad de cuotas: 12 " );
            }
        }
        if(cupon==1){
            System.out.println(" Cupon valido: 10%" );
        }
    }

    public double compraEfectivo(){
        double descuento = prenda.getPrecioBase()*0.15;
        System.out.println("El descuento aplicado al producto es de $" + descuento);
        double precioContado = prenda.getPrecioBase()-descuento;

        if(cupon==1){
            System.out.println("Descuento aplicado por cupon:" + (precioContado*0.10));
            double precioFinal= precioContado-(precioContado*0.10) ;
            return precioFinal;
        }
        return precioContado;
    }

    public double cuponC () {
            System.out.println("Descuento aplicado por cupon:" + (prenda.getPrecioBase()*0.10));
            return prenda.getPrecioBase() - (prenda.getPrecioBase()*0.10) ;
    }

    public double cuotasPB () {
        if(cupon==1){
            double precioCuotaCupon=cuponC();
            if (cuota==1){
                System.out.println("Recargo aplicado:" + (precioCuotaCupon*0.05 ));
                return precioCuotaCupon + (precioCuotaCupon*0.05);
            }else if (cuota==2){
                System.out.println("Recargo aplicado:" + (precioCuotaCupon*0.08 ));
                return precioCuotaCupon + (precioCuotaCupon*0.08);
            }else{
                System.out.println("Recargo aplicado:" + (precioCuotaCupon * 0.12));
                return precioCuotaCupon + (precioCuotaCupon * 0.12);
            }
        }else{
            if (cuota==1){
                System.out.println("Recargo aplicado:" + (prenda.getPrecioBase()*0.05));
                return prenda.getPrecioBase() + (prenda.getPrecioBase()*0.05);
            }else if (cuota==2){
                System.out.println("Recargo aplicado:" + (prenda.getPrecioBase()*0.08));
                return prenda.getPrecioBase() + (prenda.getPrecioBase()*0.08);
            }else {
                System.out.println("Recargo aplicado:" + (prenda.getPrecioBase()*0.12));
                return prenda.getPrecioBase() + (prenda.getPrecioBase()*0.12);
            }
        }
    }
}
