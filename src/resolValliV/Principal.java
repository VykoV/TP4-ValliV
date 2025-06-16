package resolValliV;

import java.util.Scanner;

import resolValliV.Ejercicio1.Ejercicio1;
import resolValliV.Ejercicio2.Ejercicio2;

public class Principal {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Inserte numero de ejercicio que quiere acceder " +
                "\n 1. Ejercicio 1: Tienda de Ropa con Sistema de Compras y Cuotas" +
                "\n 2. Ejercicio 2: Agenda telefónica de contactos"+
                "\n 3. Salir");
        int opcion = scanner.nextInt();
        switch(opcion){
            case (1):
                Ejercicio1.ejecutar();
                break;
            case (2):
                Ejercicio2.ejecutar();
                break;
            case (3):
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta. Ingrese un numero del 1-6");
                main(args);
                break;
        }
    }
}