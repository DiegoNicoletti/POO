/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_03;

import Operacion.Operacion;
import ServiceOperacion.ServiceOperacion;

/**
 *
 * @author SHIRO
 */
public class CargarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceOperacion sc1 = new ServiceOperacion();
        ServiceOperacion sc2 = new ServiceOperacion();
        Operacion n1 = sc1.crearOperacion1();
        sc1.MostrarNumero1(n1);
        Operacion n2 = sc2.crearOperacion2();
        sc2.MostrarNumero2(n2);
        
    }
    
}
