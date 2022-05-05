/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Circunferencia.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceCircunferencia {

    Scanner leer = new Scanner(System.in);
    Double pi = 3.14;

    public Circunferencia crearCircunferencia() {
        
        //Instanciar un objeto de tipo Libro(crear).
        Circunferencia c1 = new Circunferencia();

        //Llenado de atributos.
        System.out.println("Introduzca el radio:");
        c1.setRadio(leer.nextInt());
        return c1;
    }
    
    public void Area(Circunferencia c1){
        Double resArea = pi*(Math.pow(c1.getRadio(), c1.getRadio()));
        System.out.println("El Area es igual a: "+resArea);
    }
    public void Perimetro(Circunferencia c1){
        Double resPerimetro = 2*pi*c1.getRadio();
        System.out.println("El Perimetro es igual a: "+resPerimetro);
    }

}
