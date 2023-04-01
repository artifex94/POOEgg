/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author rami_
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Circunferencia circulo = new Circunferencia();

            System.out.println("Intrduzca un radio ");
            System.out.println(circulo.crearCircunferencia(leer.nextInt(), circulo));
            System.out.println("El area de un circulo con ese radio es: " + circulo.getArea());
            System.out.println("El perimetro de un circulo con ese radio es: " + circulo.getPerimetro());
        }
    }

}
