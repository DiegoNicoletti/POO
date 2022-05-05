/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceOperacion;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceOperacion {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion1(){
        //Instanciar un objeto.
        Operacion n1 = new Operacion();
        
        System.out.println("Introduzca el primer numero.");
        n1.setNumero1(leer.nextInt());
        return n1;
    }
    public Operacion crearOperacion2(){
        //Instanciar un objeto.
        Operacion n2 = new Operacion();
        
        System.out.println("Introduzca el segundo numero.");
        n2.setNumero2(leer.nextInt());
        return n2;
    }
    public void MostrarNumero1(Operacion n1){
        System.out.println("El primer numero es: "+n1.getNumero1());
    }
    public void MostrarNumero2(Operacion n2){
        System.out.println("El segundo numero es: "+n2.getNumero2());
    }
}
