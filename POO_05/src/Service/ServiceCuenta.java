/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceCuenta {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        Cuenta c = new Cuenta();
        System.out.println("Cree su numero de cuenta.");
        c.setnCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI.");
        c.setDNI(leer.nextInt());
        System.out.println("Ingrese su saldo actual.");
        c.setSaldo(leer.nextInt());
        return c;
    }
    public Cuenta Ingreso(Cuenta c){
        int ingreso, resIngreso;
        System.out.println("Monto a ingresar.");
        ingreso = leer.nextInt();
        resIngreso = ingreso + c.getSaldo();
        c.setSaldo(resIngreso);
        return c;
    }
    public Cuenta Retiro(Cuenta c){
        int retiro, resRetiro;
        System.out.println("Monto a retirar.");
        retiro = leer.nextInt();
        if(retiro<c.getSaldo()){
            resRetiro = c.getSaldo()-retiro;
            c.setSaldo(resRetiro);
            System.out.println("Retiro: $"+retiro);
            return c;
        }else{
           System.out.println("Retiro: $"+c.getSaldo());
           c.setSaldo(0);
           return c;
        }
    }
    public Cuenta ExtraccionRapida(Cuenta c){
        int retiro, porciento20, resRetiro;
        System.out.println("Monto a retirar.");
        retiro = leer.nextInt();
        porciento20 = (c.getSaldo()/100)*20;
        if(retiro<=porciento20){
            resRetiro = c.getSaldo()-retiro;
            c.setSaldo(resRetiro);
        }else{
            System.out.println("Solo puede retirar - o = al 20%.");
        }
        return c;
    }
    public void ConsultarSaldo(Cuenta c){
        System.out.println("Su saldo es de: "+c.getSaldo());
    }
    public void ConsultarDatos(Cuenta c){
        System.out.println("N° de Cuenta: "+c.getnCuenta());
        System.out.println("N° de DNI: "+c.getDNI());
        System.out.println("Saldo actual: $"+c.getSaldo());
    }
}
