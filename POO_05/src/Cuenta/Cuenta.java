/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author SHIRO
 */
public class Cuenta {
    public int nCuenta;
    public int DNI;
    public int saldo;

    public Cuenta() {
    }

    public Cuenta(int nCuenta, int DNI, int saldo) {
        this.nCuenta = nCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
