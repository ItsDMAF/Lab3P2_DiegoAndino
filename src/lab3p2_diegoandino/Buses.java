package lab3p2_diegoandino;

public class Buses extends Vehiculos {

    private int pasajeros;
    private String tipo;
   

    public Buses(int pasajeros, String color, String modelo, int año, int precio, int llantas) {
        super(color, modelo, año, precio, llantas);
        if (pasajeros > 50) {
            this.tipo = "De Ruta";

        }
        else{
            this.tipo = "Rapiditos";
        }
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Buses{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
    

}
