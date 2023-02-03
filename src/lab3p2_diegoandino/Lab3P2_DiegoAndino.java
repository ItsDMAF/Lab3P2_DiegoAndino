package lab3p2_diegoandino;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoAndino {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Concesionaria> lista = new ArrayList();
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
//------------------------------------------------------------------------------
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

                            break;
                        case 2:
                            System.out.println("Eliminar");

                            break;
                        case 3:
                            System.out.println("Modificar");

                            break;

                    }

                    break;
//------------------------------------------------------------------------------
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

                                break;
                            case 2:
                                System.out.println("Eliminar");

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

}
