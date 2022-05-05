/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceMatematica;


import Matematica.Matematica;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceMatematica {
    Scanner leer = new Scanner(System.in);
    
    public Matematica CrearNumeros(){
        Matematica m = new Matematica();
        System.out.println("Primer numero:");
        m.setN1(leer.nextDouble());
        System.out.println("Segundo numero:");
        m.setN2(leer.nextDouble());
        return m;
    }
    public Matematica DevolverMayor(Matematica m){
        System.out.println("El mayo de los dos numeros es:");
        System.out.println(Math.max(m.getN1(), m.getN2()));
        return m;
    }
    public Matematica CalcularPotencia(Matematica m){
        Double mayor, menor;
        System.out.println("Se realizara el mayor numero, elevado a la potencia del menor.");
        mayor = Math.max(m.getN1(), m.getN2());
        menor = Math.min(m.getN1(), m.getN2());
        System.out.println(Math.pow(mayor, menor));
        return m;
    }
    public Matematica CalcularRaiz(Matematica m){
        Double menor;
        menor = Math.min(m.getN1(), m.getN2());
        System.out.println("Valor absoluto de: "+menor);
        System.out.println("Es igual a: "+Math.abs(menor));
        System.out.println("Ahora la raiz cuadrada de :"+Math.abs(menor));
        System.out.println("Es igual a :"+Math.sqrt(Math.abs(menor)));
        return m;
    }
}
