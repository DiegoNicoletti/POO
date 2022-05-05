/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

/**
 *
 * @author SHIRO
 */
public class Cafetera {
    
    public int maxCafe;
    public int actualCafe;

    public Cafetera() {
    }

    public Cafetera(int maxCafe, int actualCafe) {
        this.maxCafe = maxCafe;
        this.actualCafe = actualCafe;
    }

    public int getMaxCafe() {
        return maxCafe;
    }

    public void setMaxCafe(int maxCafe) {
        this.maxCafe = maxCafe;
    }

    public int getActualCafe() {
        return actualCafe;
    }

    public void setActualCafe(int actualCafe) {
        this.actualCafe = actualCafe;
    }
    
    
}
