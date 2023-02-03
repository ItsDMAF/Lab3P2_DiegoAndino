
package lab3p2_diegoandino;

import java.awt.Color;

public class Vehiculos {
    
    private String color;
    private String modelo;
    private int año;
    private int precio;
    private int llantas;

    public Vehiculos(String color, String modelo, int año, int precio, int llantas) {
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColra() {
        return color;
    }

    public void setColra(String colra) {
        this.color = colra;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "colra=" + color + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    
    
    
}
