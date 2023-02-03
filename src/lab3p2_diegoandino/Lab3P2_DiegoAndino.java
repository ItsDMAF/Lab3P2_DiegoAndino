package lab3p2_diegoandino;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoAndino {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Concesionaria> lista = new ArrayList();
        ArrayList<Cliente> cline = new ArrayList();
        Concesionaria cons = new Concesionaria();
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. CRUD Concesionaria\n"
                    + "2. CRUD Clientes\n"
                    + "3. CRUD Vehiculos\n"
                    + "4. Compra/Venta de vehículos por parte de un cliente");
            System.out.println("Ingrese su opcion");
            opcion = leer.nextInt();

            switch (opcion) {
//CONCESIONARIA-----------------------------------------------------------------
                case 1:
                    int ops1;
                    System.out.println("CONCESIONARIA");
                    System.out.println("1.Crear\n"
                            + "2.Eliminar\n"
                            + "3.Modicifacar");
                    System.out.println("Ingrese su opcion: ");
                    ops1 = leer.nextInt();

                    switch (ops1) {
                        case 1:
                            System.out.println("Crear");

                            lista.add(Concesionaria());

                            break;
                        case 2:
                            System.out.println("Eliminar");
                            System.out.println(lista);
                            System.out.println("Ingrese la posicion de la concesionaria a eliminar: ");
                            int pos = leer.nextInt();

                            lista.remove(lista.get(pos));

                            break;
                        case 3:
                            System.out.println("Modificar");

                            break;

                    }

                    break;
//CLIENTES----------------------------------------------------------------------
                case 2:
                    if (lista.size() <= 0) {

                        int ops2;
                        System.out.println("CLIENTES");
                        System.out.println("1.Crear\n"
                                + "2.Eliminar\n"
                                + "3.Modicifacar");
                        System.out.println("Ingrese su opcion: ");
                        ops2 = leer.nextInt();

                        switch (ops2) {
                            case 1:
                                System.out.println("Crear");
                                cline.add(Cliente());

                                break;
                            case 2:
                                System.out.println("Eliminar");
                                System.out.println(cline);
                                System.out.println("Ingrese la posicion de el Cliente a eliminar: ");
                                int pos = leer.nextInt();

                                lista.remove(cline.remove(pos));

                                break;
                            case 3:
                                System.out.println("Modificar");

                                break;
                        }
                    } else {
                        System.out.println("No hay una concesionaria aun");
                    }

                    break;
//VEHICULOS---------------------------------------------------------------------
                case 3:
                    if (lista.size() >= 0) {

                        int ops3;
                        System.out.println("VEHIVULOS");
                        System.out.println("1.Crear\n"
                                + "2.Eliminar\n"
                                + "3.Modicifacar");
                        System.out.println("Ingrese su opcion: ");
                        ops3 = leer.nextInt();

                        switch (ops3) {
                            case 1:
                                System.out.println("Crear");

                                break;
                            case 2:
                                System.out.println("Eliminar");
                                System.out.println(lista);
                                System.out.println("Ingrese la concecionaria: ");
                                int pos = leer.nextInt();
                                System.out.println(lista.get(pos).getProductos());
                                System.out.println("Ingrese el vehiculo que dea eliminar: ");
                                int poss = leer.nextInt();

                                lista.get(pos).getProductos().remove(poss);

                                break;
                            case 3:
                                System.out.println("Modificar");

                                break;

                        }
                    } else {
                        System.out.println("No hay una concesionaria aun");
                    }

                    break;
//------------------------------------------------------------------------------
                case 4:
                    System.out.println("Compra/Venta de vehículos por parte de un cliente");

                    break;
//------------------------------------------------------------------------------
            }

        } while (opcion != 0);

    }

    static Concesionaria Concesionaria() {
        String nomemp;
        int id;
        String direccion;

        Concesionaria retorno;
        System.out.println("Ingrese nombre:");
        nomemp = leer.next();
        System.out.println("Ingrese identidad:");
        id = leer.nextInt();
        System.out.println("Ingrese la direccion:");
        direccion = leer.next();

        retorno = new Concesionaria(nomemp, id, direccion);
        return retorno;
    }

    static Cliente Cliente() {
        int id;
        String name;
        int saldo;

        Cliente retorno;
        System.out.println("Ingrese la identidad:");
        id = leer.nextInt();
        System.out.println("Ingrese el nombre:");
        name = leer.next();
        System.out.println("Ingrese su saldo:");
        saldo = leer.nextInt();

        retorno = new Cliente(id, name, saldo);
        return retorno;
    }
    
    

}
