/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaCircunferencia;

import Circunferencia.Circunferencia;
import Service.ServiceCircunferencia;

/**
 *
 * @author SHIRO
 */
public class CargaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceCircunferencia sc = new ServiceCircunferencia();
        Circunferencia c1 = sc.crearCircunferencia();
        sc.Area(c1);
        sc.Perimetro(c1);
    }
    
}
