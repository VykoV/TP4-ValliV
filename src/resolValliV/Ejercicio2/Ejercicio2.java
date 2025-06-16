package resolValliV.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        AgendaDeContacto agendaDeContacto;
        System.out.println("La cantidad maxima predeterminada es 10 contactos ¿Desea modificar la cantidad maxima?" +
                "\n1. Si" +
                "\n2. No");
        int opcionCap = scanner.nextInt();
        if(opcionCap==1){
            System.out.println("¿Cuantos contactos desea añadir?");
            int opcionCant = scanner.nextInt();
             agendaDeContacto = new AgendaDeContacto(opcionCant);
        }else{
             agendaDeContacto = new AgendaDeContacto();
        }
        int opcionCase;
        do{
            System.out.println("Que desea hacer?" +
                    "\n1. Añadir un contacto" +
                    "\n2. Verificar si existe el contacto" +
                    "\n3. Listar toda la agenda" +
                    "\n4. Buscar un contacto" +
                    "\n5. Eliminar un contacto" +
                    "\n6. Verificar si la agenda esta llena" +
                    "\n7. Verificar si hay espacio libre" +
                    "\n8. Salir"
            );
            opcionCase= scanner.nextInt();
            scanner.nextLine();
            switch (opcionCase){
                case 1:
                    System.out.println("Añadir un contacto " +
                            "\nIngrese el nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el telefono ");
                    int numero = scanner.nextInt();
                    agendaDeContacto.aniadirContacto(new Contacto(nombre, numero));
                    break;
                case 2:
                    System.out.print("Ingrese numero de telefono a verificar ");
                    int numerotel = scanner.nextInt();
                    boolean e = agendaDeContacto.existeContacto(new Contacto("", numerotel));
                    if(e){
                        System.out.println("El contacto existe");
                    }else{
                        System.out.println("El contacto no existe");
                    }
                    break;
                case 3:
                    agendaDeContacto.listarContactos();
                    break;
                case 4:
                    System.out.print("Inserte el nombre a buscar: ");
                    String buscNombre = scanner.nextLine();
                    agendaDeContacto.buscaContacto(buscNombre);
                    break;
                case 5:
                    System.out.print("Inserte el nro de telefono ");
                    int telefono = scanner.nextInt();
                    agendaDeContacto.eliminarContacto(new Contacto("", telefono));
                    break;

                case 6:

                    if(agendaDeContacto.agendaLlena()){
                        System.out.println("La agenda esta llena");
                    }else{
                        System.out.println("La agenda no esta llena");
                    }

                    break;

                case 7:
                    System.out.println("Espacio disponible: " + agendaDeContacto.espacioLibre());
                    break;

                case 8:
                    System.out.println("Cerrando menu");
                    break;

                default:
                    System.out.println("Numero incorrecto, intentelo de nuevo");
                    break;
            }
        }while(opcionCase!=8);

    }
}
