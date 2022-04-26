/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesFactory;

import Articulos.Computadora;
import Articulos.Smartphone;
import Articulos.Tablet;

public class Articulo {
public static Factory createArticulo (int tipo)
    {
        switch (tipo) 
        {
         
            case Factory.COMPUTADORA_ALIEN:
                return new Computadora ("intel",true,8,480,"SSD");
                
                
            case Factory.COMPUTADORA_LENOVO:
                return new Computadora ("amd",true,4,260,"HDD");
                
            case Factory.SMARTPHONE_MOTOROLA:
                return new Smartphone ("Motorola",48,64,4,true);
                
            case Factory.SMARTPHONE_IPHONE:
                return new Smartphone ("IPHONE",48,125,4,false); 
                                
            case Factory.TABLET_LENOVO:
                return new Tablet ("Lenovo",4,10,false);
                
            case Factory.TABLET_SAMSUNG:
                return new Tablet ("Samsung",6,12,true);    
                                                      
            default:
                throw new AssertionError();
        }
        
    }
        
}
