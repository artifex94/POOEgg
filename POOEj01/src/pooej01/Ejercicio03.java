/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author rami_
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operacion calculo = new Operacion();
        System.out.println("ingrese 2 numeros");
        calculo.crearOperacion(leer.nextInt(), leer.nextInt());
        System.out.println("la suma es: " + calculo.sumar());
        System.out.println("la resta es: " + calculo.restar());
        System.out.println(calculo.multiplicar());
        System.out.println(calculo.dividir());

    }
    
}
