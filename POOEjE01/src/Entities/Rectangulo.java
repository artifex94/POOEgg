/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author rami_
 */
public class Rectangulo {
    //      ATRIBUTOS   //
    private int altura, base;
    
    //      MÉTODOS     //
    
    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
    // Get's y Set's
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    //Dev
    public int calcularSuperficie(){
        int superficie = base*altura;
        return superficie;
    }
    public int calcularPerimetro(){
        int perimetro = (base+altura)*2;
        return perimetro;
    }
    
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            System.out.print(" # ");
            for (int j = 0; j < base-1; j++) {
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
