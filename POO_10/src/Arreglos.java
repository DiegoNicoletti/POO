/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHIRO
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double vector[] = new double[50];
        double vector2[] = new double[20];
        double n = 0.5;
        
        for (int i = 0; i < 50; i++) {
            vector[i]= (float)(Math.random()*10);
        }
        
        for (int i = 0; i < 20; i++) {
            if(i<10){
                vector2[i] = vector[i];
            }else{
                vector2[i] = 0.5;
            }
        }
        
        System.out.println("Vector de 50:");
        for (int i = 0; i < 50; i++) {
            System.out.println("["+ vector[i] + "]");
        }
        
        System.out.println("Vector de 20:");
        for (int i = 0; i < 20; i++) {
            System.out.println("["+ vector2[i] + "]");
        }
    }
    
}
