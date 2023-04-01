/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author rami_
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la base del rectángulo");
        rectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo");
        rectangulo.setAltura(leer.nextInt());
        
        rectangulo.dibujar();
    }
    
}
