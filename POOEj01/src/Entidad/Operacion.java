/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author rami_
 */
public class Operacion {

    private int numero1, numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(int num1, int num2) {
        numero1 = num1;
        numero2 = num2;
    }

    public int sumar() {
        int suma;
        suma = numero1 + numero2;
        return suma;
    }

    public int restar() {
        int resta;
        resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        int multi;

        if (numero1 == 0 || numero2 == 0) {
            System.out.print("ERROR : uno de los numeros fue :");
            return 0;
        } else {
            System.out.print("la multiplicacion es: ");
            multi = numero1 * numero2;
            return multi;
        }
    }
    public double dividir() {
        double divi;
        double num1 = numero1,num2 = numero2;

        if (numero2 == 0) {
            System.out.print("ERROR : el divisor es :");
            return 0;
        } else {
            System.out.print("la division es:");
            divi = num1 / num2;
            return divi;
        }
    }
}
