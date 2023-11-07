/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8p10;

/**
 *
 * @author González De Luna Berenice
 * Clase que creará las funciones de una Cuenta bancaria y la obtención del saldo
 */

public class CuentaBancaria {
    private double saldo;

    /**
     * Constructor vacío
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor con saldo
     * @param saldo saldo
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método para depositar
     * @param monto monto a depositar
     */
    public void depositar(double monto){
        System.out.println("Depositado...");
        System.out.println("Saldo anterior: " + this.getSaldo());
        this.saldo += monto; 
        System.out.println("Saldo actual: " + this.getSaldo());
    }
    
    /**
     * Método para retirar
     * @param monto monto a retirar
     */
    public void retirar(double monto){
        System.out.println("Retirando...");
        System.out.println("Saldo anterior: " + this.getSaldo());
        this.saldo -= monto; 
        System.out.println("Saldo actual: " + this.getSaldo());
    }

    /**
     * Obtiene saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica saldo
     * @param saldo saldo a modificar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método sobrescrito
     * @return cadena con saldo
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldo=" + saldo + '}';
    }
}
