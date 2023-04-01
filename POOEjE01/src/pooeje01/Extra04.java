/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje01;
import java.util.Scanner;
import Entities.Cuenta;
/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita 
 * retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo 
 * después de realizar una transacción de retiro.
 * 
 * @author rami_
 */
public class Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta001 = new Cuenta("pepito", 10000);
        
        cuenta001.retirarDinero();
    }
    
}
