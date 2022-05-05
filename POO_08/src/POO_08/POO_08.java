/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_08;

import Cadena.Cadena;
import ServiceCadena.ServiceCadena;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class POO_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServiceCadena sc = new ServiceCadena();
        Cadena c = sc.CrearCadena();
        sc.ContarVocales(c);
        sc.InvertirFrase(c);
        sc.VecesRepetido(c);
        sc.CompararLongitud(c);
        sc.UnirFrases(c);
        sc.Reemplazar(c);
        sc.Contiene(c);
    }
    
}
