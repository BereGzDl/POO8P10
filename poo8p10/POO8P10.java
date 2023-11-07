/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8p10;

/**
 *
 * @author González De Luna Berenice
 */
public class POO8P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        //Fuera de rango
        
        /**
         * Exception fuera de rango
         */
        try{
            String[] mensajes= {"Primero","Segundo","Tercero"};
            for(int i=0; i<=3; i++){
                System.out.println("Mensaje: " + mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        /**
         * Manejo de una exception 
         * try: utilizado para definir el bloque de código en el cual una excepción pueda ocurrir
         * catch: utilizados para definir un bloque de código que maneje la excepción.
         */
        try{
            double x;
            x = 0 / 0;
            System.out.println("x: " + x);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Se ejecuta el bloque finally");
        }
        
        /** 
         * Uso de más de un catch seguidos
         */
        try{
            double x;
            x = 0 / 0;
            System.out.println("x: " + x);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hola");
        
        /**
         * Creacción de propagación
         */
        try{
            double division = metodoDivision(4.0,0.0);
        }catch(UnsupportedOperationException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        /**
         * Constructor de CuentaBancaria
         */
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        
        /**
         * Se necesitan crear el try y catch
         */
        cuentaBancaria.depositar(2000);
        cuentaBancaria.retirar(3000);
        cuentaBancaria.getSaldo();
        cuentaBancaria.retirar(1000);
        cuentaBancaria.getSaldo();
        cuentaBancaria.retirar(1000);
        cuentaBancaria.getSaldo();
        cuentaBancaria.depositar(200);
        cuentaBancaria.retirar(100);
        
    }

    /**
     * 
     * @param d número para división
     * @param par1 número para división
     * @return regresa una operación no soportada
     * @throws UnsupportedOperationException error que puede ser lanzada
     */
    private static double metodoDivision(double d, double par1) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
    
}
