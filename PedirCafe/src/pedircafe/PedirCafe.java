/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedircafe;

import Cafetera.Cafetera;
import ServiceCafetera.ServiceCafetera;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class PedirCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiceCafetera sc = new ServiceCafetera();
        Cafetera c = sc.Cafe();
        String fin=null;
        int opcion;
        
        System.out.println("    Que opcion va a realizar:");
        System.out.println("1_Servir cafe.");
        System.out.println("2_Llenar cafetera.");
        System.out.println("3_Vaciar cafetera.");
        System.out.println("4_Agregar cafe a la cafetera.");
        System.out.println("5_Fin.");
        
        while(!"s".equals(fin)){
            System.out.println("Seleccione una opcion:");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    sc.ServirTaza(c);
                    break;
                case 2:
                    sc.LlenarCafetera(c);
                    break;
                case 3:
                    sc.VaciarCafetera(c);
                    break;
                case 4:
                    sc.AgregarCafe(c);
                    break;
                case 5:
                    System.out.println("Seguro que desea salir? s/n");
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
