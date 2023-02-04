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
                            System.out.println(lista);
                            System.out.println("Ingrese la concesionaria a modificar su direccion: ");
                            int position = leer.nextInt();

                            if (lista.get(position) instanceof Concesionaria) {
                                System.out.println("Ingrese la nueva direccion: ");
                                String nuevaD = leer.next();

                                lista.get(position).setDireccion(nuevaD);
                            }

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
                                System.out.println("No se puede modificar el cliente...");

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
                                System.out.println(lista);
                                System.out.println("Ingrese la posicion que desea modificar: ");
                                int pose = leer.nextInt();

                                System.out.println("Modificar");
                                System.out.println("1.Carro\n"
                                        + "2.Camionz\n"
                                        + "3.Buses\n"
                                        + "4.Bicicleta\n"
                                        + "5.Motocicleta");
                                System.out.println("Ingrese vehiculo a modificar:");
                                int op = leer.nextInt();

                                switch (op) {
                                    case 1:
                                        System.out.println("Carro");
                                        System.out.println("1.Cantidad de Puertas\n"
                                                + "2.Velocidad Maxima\n"
                                                + "3.Descripcion del motor");
                                        System.out.println("Ingrese que quiere modificcar: ");
                                        int mod = leer.nextInt();
                                        switch (mod) {
                                            case 1:
                                                System.out.println("Nueva cantidad de puertas: ");
                                                int nuevoP = leer.nextInt();

                                                ((Carro) lista.get(pose).getProductos().get(op)).setPuertas(nuevoP);

                                                break;

                                            case 2:
                                                System.out.println("Nueva velocidad maxima: ");
                                                int nuevoV = leer.nextInt();

                                                ((Carro) lista.get(pose).getProductos().get(op)).setVelocidad(nuevoV);

                                                break;

                                            case 3:
                                                leer.nextLine();
                                                System.out.println("Nueva descripcion del carro: ");
                                                String nuevoD = leer.next();

                                                ((Carro) lista.get(pose).getProductos().get(op)).setDescrimotor(nuevoD);
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Camion");
                                        System.out.println("1. Volumen Maximo\n"
                                                + "2 ->  Altura\n"
                                                + "3 ->  Retroexcavadora\n");
                                        System.out.println("Ingrese que quiere modificcar: ");
                                        int mod1 = leer.nextInt();

                                        switch (mod1) {
                                            case 1:
                                                System.out.println("Ingrese el nuevo volumen maximo: ");
                                                int nuevoV = leer.nextInt();

                                                ((Camion) lista.get(pose).getProductos().get(op)).setVolumen(nuevoV);

                                                break;

                                            case 2:
                                                System.out.println("Ingrese la nueva altura: ");
                                                int nuevoA = leer.nextInt();

                                                ((Camion) lista.get(pose).getProductos().get(op)).setAltura(nuevoA);

                                                break;
                                            case 3:
                                                boolean contiene = false;
                                                System.out.println("¿Tiene retroexcavadora? 1=SI//2=NO");
                                                System.out.println("Ingrese su opcion: ");

                                                int res = leer.nextInt();
                                                if (res == 2) {
                                                    contiene = false;
                                                } else if (res == 1) {
                                                    contiene = true;
                                                }

                                                ((Camion) lista.get(pose).getProductos().get(op)).setRetroexcavadora(contiene);
                                                break;
                                        }

                                    case 3:
                                        System.out.println("Buses");
                                        System.out.println("1.Modificar Cantidad de pasajeros ");
                                        System.out.println("Ingrese su opcion");
                                        int mod2 = leer.nextInt();

                                        switch (mod2) {
                                            case 1:
                                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                                int nuevoP = leer.nextInt();

                                                ((Buses) lista.get(pose).getProductos().get(op)).setPasajeros(nuevoP);

                                                break;

                                        }

                                        break;
                                    case 4:
                                        System.out.println("Biciclieta");
                                        System.out.println("1.Descripcion del Motor\n"
                                                + "2.Tipo\n"
                                                + "3.Radio");
                                        System.out.println("Ingrese su opcion");
                                        int mod3 = leer.nextInt();

                                        switch (mod3) {
                                            case 1:
                                                leer.nextLine();
                                                System.out.println("Ingrese la nueva descripcion del motor: ");
                                                String desp = leer.next();

                                                ((Bicicleta) lista.get(pose).getProductos().get(op)).setDescripcion(desp);

                                                break;
                                            case 2:
                                                boolean contiene = false;

                                                System.out.println("Ingrese es bmx (1=SI//2=NO)");
                                                int res = leer.nextInt();
                                                if (res == 2) {
                                                    contiene = false;
                                                } else if (res == 1) {
                                                    contiene = true;
                                                }

                                                ((Bicicleta) lista.get(pose).getProductos().get(op)).setBmxcalle(contiene);

                                                break;

                                            case 3:
                                                System.out.println("Ingrese nuevo radio: ");
                                                int nuevoR = leer.nextInt();

                                                ((Bicicleta) lista.get(pose).getProductos().get(op)).setRadio(nuevoR);

                                                break;

                                            case 5:
                                                System.out.println("Motocicleta");
                                                System.out.println("1.Descripcion del Motor\n"
                                                        + "2.Modificar si es electrica");
                                                System.out.println("Ingrese su opcion");
                                                int mod4 = leer.nextInt();

                                                switch (mod4) {
                                                    case 1:
                                                        leer.nextLine();
                                                        System.out.println("Ingrese la nueva descripcion del motor: ");
                                                        String despla = leer.next();

                                                        ((Motocicleta) lista.get(pose).getProductos().get(op)).setDesplazamiento(despla);

                                                        break;

                                                    case 2:
                                                        System.out.println("¿Es electrica? (1=SI//2=NO)");
                                                        System.out.println("Ingrese su opcion");
                                                        int resp = leer.nextInt();

                                                        boolean elec = false;
                                                        if (resp == 2) {
                                                            elec = false;
                                                        } else if (resp == 1) {
                                                            elec = true;
                                                        }

                                                        ((Motocicleta) lista.get(pose).getProductos().get(op)).setElectrica(elec);

                                                        break;
                                                }

                                                break;
                                        }

                                        break;

                                }
                        }
                    } else {
                        System.out.println("No hay una COncesionaria");
                    }
                    break;
//------------------------------------------------------------------------------
                case 4:
                    System.out.println("Compra o Venta:\n"
                            + "1 -> Comprar\n"
                            + "2 -> Vender");
                    int resp = leer.nextInt();

                    if (resp == 1) {
                        System.out.println(lista);

                        System.out.println("Ingrese la concesionaria: ");
                        int posicion = leer.nextInt();

                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("--" + lista.get(posicion).getProductos().get(i));
                        }
                        System.out.println("Ingrese la posicion del vehiculo a comprar: ");
                        int pos1 = leer.nextInt();

                        System.out.println(cline);
                        System.out.println("Ingrese la posicion del: ");
                        int pos2 = leer.nextInt();


                    } else if (resp == 2) {
                        System.out.println(cline);
                        System.out.println("Ingrese el cliente: ");
                        int posicion = leer.nextInt();
                        for (int i = 0; i < cline.size(); i++) {
                            System.out.println("-- " + cline.get(posicion).getVehuculos().get(i));
                        }
                        

                    }

                    break;
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
