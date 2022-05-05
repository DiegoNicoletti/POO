/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceCadena;

import Cadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServiceCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena CrearCadena(){
        Cadena c = new Cadena();
        String frase;
        int largo;
        System.out.println("Ingrese una frase.");
        frase = leer.next();
        System.out.println("Frase ingresada: "+frase);
        c.setFrase(frase);
        largo = frase.length();
        c.setLongitud(largo);
        System.out.println("Longitud de: "+c.getLongitud());
        return c;
    }
    
    public Cadena ContarVocales(Cadena c){
        
        String vocal, frase=c.getFrase();
        int contador=0, largo=c.getLongitud();
        
        for (int i = 0; i < largo; i++) {
            if(frase.charAt(i)=='a'){
                contador++;
            }else if(frase.charAt(i)=='e'){
                contador++;
            }else if(frase.charAt(i)=='i'){
                contador++;
            }else if(frase.charAt(i)=='o'){
                contador++;
            }else if(frase.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Cantidad de vocales: "+contador);
        return c;
    }
    
    public Cadena InvertirFrase(Cadena c){
        String inverso="", vocal, frase=c.getFrase();
        int largo=c.getLongitud();
        for (int i = largo; i > 0; i--) {
            vocal = frase.substring(i, i--);
            inverso = inverso.concat(vocal);
        }
        System.out.println(inverso);
        return c;
    }
    
    public Cadena VecesRepetido(Cadena c){
        String letra, vocal, frase=c.getFrase();
        int contador=0, largo=c.getLongitud();
        System.out.println("Que letra quiere ver si se repite?");
        letra = leer.next();
        for (int i = 0; i < largo; i++) {
            if(letra.equals(i)){
                contador++;
            }else{
                
            }
        }
        System.out.println("Letras "+letra+" contadas: "+contador);
        return c;
    }
    
    public Cadena CompararLongitud(Cadena c){
        String frase2, frase=c.getFrase();
        int res;
        System.out.println("Ingrese una frase.");
        frase2 = leer.next();
        System.out.println("Compararemos la frase original con la recien ingresada.");
        res = frase.compareTo(frase2);
        if(res==0){
            System.out.println("Son igual de largas.");
        }else if(res==-1){
            System.out.println("La segunda es mas larga.");
        }else if(res==1){
            System.out.println("La primera es mas larga.");
        }
        return c;
    }
    
    public Cadena UnirFrases(Cadena c){
        String nfrase,res, frase=c.getFrase();
        System.out.println("La frase original es: "+frase);
        System.out.println("");
        System.out.println("Ingrese una frase para unir a esa.");
        nfrase = leer.next();
        res = frase.concat(nfrase);
        System.out.println("Resultado: ");
        System.out.println(res);
        return c;
    }
    
    public Cadena Reemplazar(Cadena c){
        String caracter, letra, vocal, nfrase="", frase=c.getFrase();
        int largo=c.getLongitud();
        System.out.println("Ingrese una letra, caracter o numero.");
        caracter = leer.next();
        System.out.println("Indique que letra se cambiara por ese caracter.");
        letra = leer.next();
        
        for (int i = 0; i < largo; i++) {
            vocal = frase.substring(i, i++);
            if(vocal==letra){
                nfrase = nfrase.concat(caracter);
            }else{
                nfrase = nfrase.concat(vocal);
            }
        }
        System.out.println("Nueva frase:");
        System.out.println(nfrase);
        return c;
    }
    
    public Cadena Contiene(Cadena c){
        String letra, buscar, frase=c.getFrase();
        int largo=c.getLongitud(), contador=0;
        System.out.println("Que letra quiere buscar?");
        buscar = leer.next();
        for (int i = 0; i < largo; i++) {
            letra = frase.substring(i, i++);
            if(letra==buscar){
                contador=contador++;
            }
        }
        System.out.println("La letra esta un total de: "+contador);
        return c;
    }
}
