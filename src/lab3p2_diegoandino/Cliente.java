
package lab3p2_diegoandino;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String name;
    private ArrayList<Vehiculos> vehuculos = new ArrayList();
    private int saldo;

    public Cliente(int id, String name, int saldo) {
        this.id = id;
        this.name = name;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehiculos> getVehuculos() {
        return vehuculos;
    }

    public void setVehuculos(ArrayList<Vehiculos> vehuculos) {
        this.vehuculos = vehuculos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", vehuculos=" + vehuculos + ", saldo=" + saldo + '}';
    }
    
    
}
