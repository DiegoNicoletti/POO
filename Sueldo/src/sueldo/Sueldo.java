/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import Entidades.Vendedor;
import Servicios.ServicioVendedor;

/**
 *
 * @author SHIRO
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioVendedor vs = new ServicioVendedor();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
