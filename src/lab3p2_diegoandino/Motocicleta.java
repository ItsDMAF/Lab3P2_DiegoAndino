
package lab3p2_diegoandino;

public class Motocicleta extends Vehiculos {
    private String desplazamiento;
    private boolean electrica;

    public Motocicleta(String color, String modelo, int año, int precio, int llantas, String desplazamiento, boolean elextrica) {
        super(color, modelo, año, precio, llantas);
        this.desplazamiento = desplazamiento;
                this.electrica = electrica;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }
    
    
    
    

   
    
    
    
}
