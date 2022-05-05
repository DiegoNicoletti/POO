/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCafetera;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceCafetera {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera Cafe(){
        Cafetera c = new Cafetera();
        System.out.println("Indique la cantidad maxima de la cafetera.");
        c.setMaxCafe(leer.nextInt());
        System.out.println("Indique la cantidad actual de cafe.");
        c.setActualCafe(leer.nextInt());
        return c;
    }
    
    public Cafetera LlenarCafetera(Cafetera c){
        int llenar = c.getMaxCafe();
        c.setActualCafe(llenar);
        System.out.println("Cafetera Rellenada.");
        return c;
    }
    
    public Cafetera ServirTaza(Cafetera c){
        int taza, restos, actual, tazaServida;
        actual = c.getActualCafe();
        System.out.println("    Seleccione el numero del tamaño de su taza:");
        System.out.println("1_Pequeña.");
        System.out.println("2_Mediana.");
        System.out.println("3_Grande.");
        System.out.println("4_Extra Grande.");
        taza = leer.nextInt();
        
        switch(taza){
            case 1:
                if(actual>=taza){
                    restos = actual - 100;
                    c.setActualCafe(restos);
                    return c;
                }else{
                    tazaServida = actual;
                    System.out.println("Su taza de 100ml quedo con: "+tazaServida+"ml");
                    c.setActualCafe(0);
                    System.out.println("La cafetera se vació.");
                    return c;
                }
            case 2:
                if(actual>=taza){
                    restos = actual - 200;
                    c.setActualCafe(restos);
                    return c;
                }else{
                    tazaServida = actual;
                    System.out.println("Su taza de 100ml quedo con: "+tazaServida+"ml");
                    c.setActualCafe(0);
                    System.out.println("La cafetera se vació.");
                    return c;
                }
            case 3:
                if(actual>=taza){
                    restos = actual - 350;
                    c.setActualCafe(restos);
                    return c;
                }else{
                    tazaServida = actual;
                    System.out.println("Su taza de 100ml quedo con: "+tazaServida+"ml");
                    c.setActualCafe(0);
                    System.out.println("La cafetera se vació.");
                    return c;
                }
            case 4:
                if(actual>=taza){
                    restos = actual - 500;
                    c.setActualCafe(restos);
                    return c;
                }else{
                    tazaServida = actual;
                    System.out.println("Su taza de 100ml quedo con: "+tazaServida+"ml");
                    c.setActualCafe(0);
                    System.out.println("La cafetera se vació.");
                    return c;
                }
        }
        return c;
    }
    
    public Cafetera VaciarCafetera(Cafetera c){
        System.out.println("Se procedera a vaciar la cafetera.");
        c.setActualCafe(0);
        return c;
    }
    
    public Cafetera AgregarCafe(Cafetera c){
        int agregar, actual=c.getActualCafe(), total, maximo = c.getMaxCafe();
        
        System.out.println("Cuanto cafe agregara?. Lo maximo es 1litro (1000).");
        agregar = leer.nextInt();
        if(maximo>=actual+agregar){
            total = actual + agregar;
            c.setActualCafe(total);
            System.out.println("El cafe quedo con un total de: "+c.getActualCafe());
        }else{
            total = maximo;
            c.setActualCafe(total);
            System.out.println("El cafe quedo lleno.");
        }
        return c;
    }
}
