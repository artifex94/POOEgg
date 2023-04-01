/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Scanner;
/**
 *
 * @author rami_
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    
    private String titular;
    private double saldo;
    
    public void retirarDinero(){
    double retiro;
    
        System.out.println("¿Cuánto desea retirar?");
        retiro = leer.nextDouble();
        
        if (saldo-retiro<0){
            System.out.println("saldo insuficiente");
        } else {
            this.saldo = saldo - retiro;
            System.out.println("Su saldo disponible es: $" + saldo);
        }
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
}
