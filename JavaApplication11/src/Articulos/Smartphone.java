
package Articulos;

import PatronesFactory.Factory;
/**
 *
 * @author Aaron3.0revolution
 */
public class Smartphone implements Factory{
    
    private String marca; 
    private int MPcamara;
    private int almacenamiento;
    private int ram; 
    private boolean dualsim;

    public Smartphone() {
    }

    public Smartphone(String marca, int MPcamara, int almacenamiento, int ram, boolean dualsim) {
        this.marca = marca;
        this.MPcamara = MPcamara;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.dualsim = dualsim;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMPcamara() {
        return MPcamara;
    }

    public void setMPcamara(int MPcamara) {
        this.MPcamara = MPcamara;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isDualsim() {
        return dualsim;
    }

    public void setDualsim(boolean dualsim) {
        this.dualsim = dualsim;
    }

    @Override
    public String toString() {
        return "\nSmartphone: " + "\n" +"\n marca: " + marca + "\n MPcamara: " + MPcamara +"mp" + "\n almacenamiento: "
                + almacenamiento + "gb" + "\n ram: " + ram + "gb" +  "\n dualsim: " + dualsim + ' ';
                
                }


    
    
}

