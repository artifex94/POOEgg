/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje01;

import Drivers.CocinaControlador;

/**
 *
 * @author rami_
 */
public class Extra04Cocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    CocinaControlador cocina = new CocinaControlador();

    System.out.println("Creo la lista de recetas");
		
    cocina.añadirReceta ();

    cocina.añadirReceta ();

    cocina.añadirReceta ();

    System.out.println("muestro la lista general");
    cocina.mostrarListado ();

    System.out.println ("muestro las recetas de guisos");
    cocina.buscarRecetaPorTitulo ("guiso");
    System.out.println ("muestro que puedo cocinar con fideos");
    cocina.buscarRecetaConIngredientesDisponibles ("fideos");
    }
    
}
