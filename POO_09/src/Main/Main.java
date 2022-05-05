/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Matematica.Matematica;
import ServiceMatematica.ServiceMatematica;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiceMatematica sm = new ServiceMatematica();
        Matematica m = sm.CrearNumeros();
        sm.DevolverMayor(m);
        sm.CalcularPotencia(m);
        sm.CalcularRaiz(m);
    }
    
}
