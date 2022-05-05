/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_05;

import Cuenta.Cuenta;
import Service.ServiceCuenta;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class POO_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiceCuenta sc = new ServiceCuenta();
        Cuenta c = sc.crearCuenta();
        String fin = null;
        int opcion;
        
        System.out.println("        MENU");
        System.out.println("1_Ingresar Dinero.");
        System.out.println("2_Retirar Dinero.");
        System.out.println("3_Extraccion Rapida (Max 20%).");
        System.out.println("4_Consultar Saldo.");
        System.out.println("5_Consultar datos.");
        System.out.println("6_Salir.");
        
        while(!"s".equals(fin)){
            System.out.println("Seleccione una opcion.");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    sc.Ingreso(c);
                    continue;
                case 2:
                    sc.Retiro(c);
                    continue;
                case 3:
                    sc.ExtraccionRapida(c);
                    continue;
                case 4:
                    sc.ConsultarSaldo(c);
                    continue;
                case 5:
                    sc.ConsultarDatos(c);
                    continue;
                case 6:
                    System.out.println("Desea salir? s/n");
                    fin = leer.next();
                    if(fin=="s"){
                        break;
                    }else{
                        continue;
                    }
            }
        }
    }
    
}
