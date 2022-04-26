
package Articulos;

import PatronesFactory.Factory;

/**
 *
 * @author Aaron3.0revolution
 */
public class Tablet implements Factory{
    
    private String marca; 
    private int ram; 
    private float tamañodepantalla; 
    private boolean sim; 

    public Tablet() {
    }

    public Tablet(String marca, int ram, int tamañodepantalla, boolean sim) {
        this.marca = marca;
        this.ram = ram;
        this.tamañodepantalla = tamañodepantalla;
        this.sim = sim;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getTamañodepantalla() {
        return tamañodepantalla;
    }

    public void setTamañodepantalla(int tamañodepantalla) {
        this.tamañodepantalla = tamañodepantalla;
    }

    public boolean isSim() {
        return sim;
    }

    public void setSim(boolean sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "\nTablet: " + "\n"+  "\n marca: " + marca + "\n ram: " +  ram + "gb" +  "\n tamañodepantalla: " + tamañodepantalla
                + "pulgadas" +  "\n sim: " + sim + ' ';
                }
    
    
    
    
    
}
