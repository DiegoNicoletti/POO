/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_04;

import Rectangulo.Rectangulo;
import ServiceRectangulo.ServiceRectangulo;

/**
 *
 * @author SHIRO
 */
public class POO_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceRectangulo sr = new ServiceRectangulo();
        Rectangulo r= sr.CrearRectangulo();
        sr.PerimetroRectangulo(r);
        sr.SuperficieRectangulo(r);
        sr.MostrarRectangulo(r);
    }
    
}
