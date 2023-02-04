package lab3p2_diegoandino;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoAndino {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Concesionaria> lista = new ArrayList();
        ArrayList<Cliente> cline = new ArrayList();
        Concesionaria cons = new Concesionaria();
        ArrayList<Vehiculos> vehi = new ArrayList();
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

                                System.out.println("Ingrese cuantas llantas tiene:");
                                int llantas = leer.nextInt();

                                if (llantas <= 2 && llantas > 0) {
                                    System.out.println("1.Motocicleta\n"
                                            + "2.Bicicleta");
                                    System.out.println("Ingrese que tipo de vehiculo es:");
                                    int op = leer.nextInt();

                                    switch (op) {
                                        case 1:
                                            vehi.add(Motocicleta());
                                            break;
                                        case 2:
                                            vehi.add(Bicicleta());
                                            break;
                                    }

                                } else {
                                    System.out.println("1.Carro\n"
                                            + "2.Camion\n"
                                            + "3.Buses\n");
                                    System.out.println("Ingrese que tipo de vehiculo es:");
                                    int op = leer.nextInt();
                                    switch (op) {
                                        case 1:
                                            vehi.add(Carro());
                                            break;
                                        case 2:
                                            vehi.add(Camion());

                                            break;
                                        case 3:
                                            vehi.add(Buses());
                                            break;

                                    }
                                }

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

    static Carro Carro() {
        String color;
        String modelo;
        int año;
        int precio;
        int llantas;

        int puertas;
        String descrimotor;
        int velocidad;

        Carro retorno;
        System.out.println("Ingrese el color:");
        color = leer.next();
        System.out.println("Ingrese el modelo:");
        modelo = leer.next();
        System.out.println("Ingrese el año de fabricacion: ");
        año = leer.nextInt();
        System.out.println("Ingrese el precio:");
        precio = leer.nextInt();
        llantas = 4;
        System.out.println("Ingrese el numero de puertas:");
        puertas = leer.nextInt();
        System.out.println("Ingrese la descripcion del motor");
        descrimotor = leer.next();
        System.out.println("Ingrese la velocidad del carro:");
        velocidad = leer.nextInt();

        retorno = new Carro(color, modelo, año, precio, llantas, puertas, descrimotor, velocidad);
        return retorno;

    }

    static Camion Camion() {
        String color;
        String modelo;
        int año;
        int precio;
        int llantas;

        int volumen;
        int altura;
        boolean retroexcavadora;

        Camion retorno;

        System.out.println("Ingrese el color:");
        color = leer.next();

        System.out.println("Ingrese el modelo:");
        modelo = leer.next();

        System.out.println("Ingrese el año de fabricacion: ");
        año = leer.nextInt();

        System.out.println("Ingrese el precio:");
        precio = leer.nextInt();
        llantas = 4;
        System.out.println("Ingese el volumen que soporta:");
        volumen = leer.nextInt();
        System.out.println("Ingrese la altura del camion:");
        altura = leer.nextInt();
        System.out.println("Ingrse si el camion trae retroexcavadora:");
        retroexcavadora = leer.nextBoolean();

        retorno = new Camion(color, modelo, año, precio, llantas, volumen, altura, retroexcavadora);
        return retorno;

    }

    static Bicicleta Bicicleta() {
        String color;
        String modelo;
        int año;
        int precio;
        int llantas;

        String descripcion;
        int radio;
        boolean bmxcalle;

        Bicicleta retorno;

        System.out.println("Ingrese el color:");
        color = leer.next();
        System.out.println("Ingrese el modelo:");
        modelo = leer.next();
        System.out.println("Ingrese el año de fabricacion: ");
        año = leer.nextInt();
        System.out.println("Ingrese el precio:");
        precio = leer.nextInt();
        llantas = 2;
        System.out.println("Ingrese la descripcion: ");
        descripcion = leer.next();
        System.out.println("Ingrese el radio:");
        radio = leer.nextInt();
        System.out.println("Ingrese si es una bmx:");
        bmxcalle = leer.nextBoolean();

        retorno = new Bicicleta(descripcion, color, radio, año, precio, modelo, llantas, bmxcalle);
        return retorno;

    }

    static Motocicleta Motocicleta() {
        String color;
        String modelo;
        int año;
        int precio;
        int llantas;

        String desplazamiento;
        boolean electrica;

        Motocicleta retorno;

        System.out.println("Ingrese el color:");
        color = leer.next();
        System.out.println("Ingrese el modelo:");
        modelo = leer.next();
        System.out.println("Ingrese el año de fabricacion:");
        año = leer.nextInt();
        System.out.println("Ingrese el precio:");
        precio = leer.nextInt();
        llantas = 2;
        System.out.println("Ingrese el desplazamiento:");
        desplazamiento = leer.next();
        System.out.println("Ingrese si es electrica:");
        electrica = leer.nextBoolean();

        retorno = new Motocicleta(color, modelo, año, precio, llantas, desplazamiento, electrica);
        return retorno;

    }

    static Buses Buses() {
        String color;
        String modelo;
        int año;
        int precio;
        int llantas;

        int pasajeros;
        String tipo;

        Buses retorno;

        System.out.println("Ingrese el color:");
        color = leer.next();
        System.out.println("Ingrese el modelo:");
        modelo = leer.next();
        System.out.println("Ingrese el año de fabricacion:");
        año = leer.nextInt();
        System.out.println("Ingrese el precio:");
        precio = leer.nextInt();
        llantas = 4;
        System.out.println("Ingrese el limite de pasajeros:");
        pasajeros = leer.nextInt();
        tipo = leer.next();

        retorno = new Buses(color, modelo, pasajeros, año, precio, llantas, tipo);
        return retorno;

    }

}
