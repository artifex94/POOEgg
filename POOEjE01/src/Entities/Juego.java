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
public class Juego {
    
    
    //      Atributos       //
    private int numJ1, numJ2, trys;
    
    //      Metodos         //
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1: Ingrese su número");
        setNumJ1(leer.nextInt());
        System.out.println("Jugador 1: Defina la cantidad de intentos a darle al Jugador 2");
        setTrys(leer.nextInt());
        
        System.out.println("Jugador 2: intente adivinar el número del jugador 1");
        setNumJ2(leer.nextInt());
        
        int cont = 0;
        while(numJ1!=numJ2 && cont!=trys){
            if (numJ2<numJ1) {
                System.out.println("El número es menor al del jugador 1");
                cont++;
                System.out.print("Vuelva a intentarlo: ");
                System.out.println("Te quedan " + (trys-cont) + " intentos");
                setNumJ2(leer.nextInt());
                
            } else {
                System.out.println("El número es mayor al del jugador 1");
                cont++;
                System.out.print("Vuelva a intentarlo: ");
                System.out.println("Te quedan " + (trys-cont) + " intentos");
                setNumJ2(leer.nextInt());
            }
        }
        
        if (numJ1==numJ2){
        System.out.println("Felicidades adivinaste el número");
        } else {
        System.out.println("Agotaste la cantidad de intentos");
        }
    }
    
    
    //  Get's & Set's
    
    public int getNumJ1() {
        return numJ1;
    }

    public void setNumJ1(int numJ1) {
        this.numJ1 = numJ1;
    }

    public int getNumJ2() {
        return numJ2;
    }

    public void setNumJ2(int numJ2) {
        this.numJ2 = numJ2;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }
    
    
    // Constructores

    public Juego() {
    }

    public Juego(int numJ1, int numJ2) {
        this.numJ1 = numJ1;
        this.numJ2 = numJ2;
    }
    
    
}
