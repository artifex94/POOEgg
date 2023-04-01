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
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        double area;
        area = Math.pow((radio * Math.PI), 2);
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = radio * Math.PI * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

    public Circunferencia crearCircunferencia(int radio, Circunferencia circulo) {

        circulo.setRadio(radio);
        return circulo;
    }
}
