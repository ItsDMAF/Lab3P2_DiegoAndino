
package lab3p2_diegoandino;

public class Bicicleta extends Vehiculos{  
    private String descripcion;
    private int radio;
    private boolean bmxcalle;

    public Bicicleta(String descripcion, int radio, boolean bmxcalle, String color, String modelo, int año, int precio, int llantas) {
        super(color, modelo, año, precio, llantas);
        this.descripcion = descripcion;
        this.radio = radio;
        this.bmxcalle = bmxcalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isBmxcalle() {
        return bmxcalle;
    }

    public void setBmxcalle(boolean bmxcalle) {
        this.bmxcalle = bmxcalle;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", bmxcalle=" + bmxcalle + '}';
    }
    
    
    
    
    
    
    
}
