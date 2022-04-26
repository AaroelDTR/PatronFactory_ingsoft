
package Articulos;

import PatronesFactory.Articulo;
import PatronesFactory.Factory;
import java.util.Scanner;


public class PruebaArt {
    
    public static void main (String[] args){
        
        int eleccion =0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Que articulo te gustaria conocer");
        System.out.println(Computadora.COMPUTADORA_ALIEN + ": Computadora  Alienware");
        System.out.println(Computadora.COMPUTADORA_LENOVO + ": Computadora Lenovo");
        System.out.println(Smartphone.SMARTPHONE_MOTOROLA + ": Celular Motorola");
        System.out.println(Smartphone.SMARTPHONE_IPHONE + ": IPHONE");
        System.out.println(Tablet.TABLET_LENOVO + ": Tablet Lenovo");
        System.out.println(Tablet.TABLET_SAMSUNG + ": Tableta Samsung");
        
            
        try {
            System.out.print("Elige el numero ");
            eleccion = entrada.nextInt(); 
            
        } catch (Exception e) {
            System.out.println("Intentalo de nuevo");
        }  
        //Articulo producto = ArtFactory.crearArticulo(seleccion);
        //System.out.println(producto.toString());
        
        Factory articulo = Articulo.createArticulo(eleccion);
        System.out.println(articulo.toString ());
        
    }
    
}
