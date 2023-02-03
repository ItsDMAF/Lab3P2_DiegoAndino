
package lab3p2_diegoandino;

import java.awt.Color;

public class Carro extends Vehiculos {
    private int puertas;
    private String descrimotor;
    private int velocidad;

    public Carro( String color, String modelo, int año, int precio, int llantas, int puertas, String descrimotor, int velocidad) {
        super(color, modelo, año, precio, llantas);
        this.puertas = puertas;
        this.descrimotor = descrimotor;
        this.velocidad = velocidad;
        
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getDescrimotor() {
        return descrimotor;
    }

    public void setDescrimotor(String descrimotor) {
        this.descrimotor = descrimotor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "puertas=" + puertas + ", descrimotor=" + descrimotor + ", velocidad=" + velocidad + '}';
    }
    
    
    
}
