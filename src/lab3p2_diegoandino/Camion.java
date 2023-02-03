
package lab3p2_diegoandino;

public class Camion extends Vehiculos {
    private int volumen;
    private int altura;
    private boolean retroexcavadora;

    public Camion(String color, String modelo, int año, int precio, int llantas, int volumen, int altura, boolean retroexca) {
        super(color, modelo, año, precio, llantas);
        this.volumen = volumen;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "volumen=" + volumen + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
    }
    
    
    
    
    
}
