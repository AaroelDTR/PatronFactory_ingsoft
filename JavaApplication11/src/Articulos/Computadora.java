
package Articulos;

import PatronesFactory.Factory;

public class Computadora implements Factory {


        
        private String MarcaDeProcesador;  
        private boolean TarjetaDeVideo; 
        private int ram;
        private int almacenamiento;
        private String TipoDeAlmacenamiento; 
                      
    

    public Computadora() {
        
        
    }
    
    public Computadora(String MarcaDeProcesador, boolean tarjetadevideo, int ram,
            int almacenamiento, String TipoDeAlmacenamiento) {
        
        this.MarcaDeProcesador = MarcaDeProcesador;
        this.TarjetaDeVideo = TarjetaDeVideo;
        this.ram = ram; 
        this.almacenamiento = almacenamiento; 
        this.TipoDeAlmacenamiento = TipoDeAlmacenamiento; 
    }

    public String getMarcaDeProcesador() {
        return MarcaDeProcesador;
    }

    public void setMarcaDeProcesador(String MarcaDeProcesador) {
        this.MarcaDeProcesador = MarcaDeProcesador;
    }

    public boolean isTarjetaDeVideo() {
        return TarjetaDeVideo;
    }

    public void setTarjetaDeVideo(boolean TarjetaDeVideo) {
        this.TarjetaDeVideo = TarjetaDeVideo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoDeAlmacenamiento() {
        return TipoDeAlmacenamiento;
    }

    public void setTipoDeAlmacenamiento(String TipoDeAlmacenamiento) {
        this.TipoDeAlmacenamiento = TipoDeAlmacenamiento;
    }

    @Override
    public String toString() {
        return "\nComputadora: " + "\n MarcaDeProcesador: " + MarcaDeProcesador + "\n TarjetaDeVideo: " + TarjetaDeVideo
                + "\n ram: " + ram + "gb" + "\n almacenamiento: " + almacenamiento + "gb" + "\n TipoDeAlmacenamientio: " + TipoDeAlmacenamiento 
                + ' ';                
                }
    
    
    
    
    
}
