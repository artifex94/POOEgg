/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje01;
import Entities.Dots;
import java.util.Scanner;
/**
 *
 * @author rami_
 */
public class Extra02 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        Dots puntos = new Dots();
        System.out.print("X1: ");
        puntos.setX1(leer.nextDouble());
        System.out.print("Y1: ");
        puntos.setY1(leer.nextDouble());
        System.out.print("X2: ");
        puntos.setX2(leer.nextDouble());
        System.out.print("Y2: ");
        puntos.setY2(leer.nextDouble());
        
        puntos.distance();
    }
    
}
