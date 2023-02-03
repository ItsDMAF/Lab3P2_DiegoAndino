
package lab3p2_diegoandino;

import java.util.ArrayList;

public class Concesionaria {
    private String nomemp;
    private int id;
    private String direccion;
    private ArrayList<Vehiculos> Productos = new ArrayList();
    
    public Concesionaria(){
        
    }

    public Concesionaria(String nomemp, int id, String direccion) {
        this.nomemp = nomemp;
        this.id = id;
        this.direccion = direccion;
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculos> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Vehiculos> Productos) {
        this.Productos = Productos;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nomemp=" + nomemp + ", id=" + id + ", direccion=" + direccion + ", Productos=" + Productos + '}';
    }
    

}
