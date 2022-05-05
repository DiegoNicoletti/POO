/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRectangulo;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceRectangulo {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo CrearRectangulo(){
        Rectangulo r = new Rectangulo();
        
        System.out.println("Introduzca la Base.");
        r.setBase(leer.nextInt());
        System.out.println("Introduzca la Altura.");
        r.setAltura(leer.nextInt());
        return r;
    }
    public void PerimetroRectangulo(Rectangulo r){
        int perimetro = (r.getBase()+r.getAltura())*2;
        System.out.println("El perimetro es igual a: "+perimetro);
    }
    public void SuperficieRectangulo(Rectangulo r){
        int superficie = r.getBase()*r.getAltura();
        System.out.println("La superficie es igual a: "+superficie);
    }
    public void MostrarRectangulo(Rectangulo r){
        for (int i = 0; i < r.getAltura(); i++){
            for (int j = 0; j < r.getBase(); j++) {
                if(i==0 || i==r.getAltura()-1){
                          System.out.print("*"); 
                }else{
                    if(j==0 || j==r.getBase()-1){ 
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
