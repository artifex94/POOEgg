/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import Entities.Cocina;
import Entities.Receta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rami_
 */
public class CocinaControlador {
    Scanner leer = new Scanner(System.in);
	
	Cocina cocina;
	Receta receta;
	
	List<Receta> listaReceta = new ArrayList<>();
	
	public CocinaControlador() {}
	
	public void añadirReceta() {
		cocina = new Cocina();
		receta = new Receta();
		
		receta.setTitulo(leer.next());
		receta.setIngrediente(leer.next());
		receta.setPreparacion(leer.next());
		
		listaReceta.add(receta);	
		
		cocina.setListaReceta(listaReceta);
	}
	
	public void buscarRecetaPorTitulo(String titulo) {
			for (int i = 0; i < listaReceta.size(); i++) {
				if (listaReceta.get(i).getTitulo().contains(titulo)) {
					System.out.println(listaReceta.get(i));
				}
			} }
	
	public void buscarRecetaConIngredientesDisponibles(String ingredientes) {
		for (int i = 0; i < listaReceta.size(); i++) {
			if (listaReceta.get(i).getIngrediente().contains(ingredientes)) {
				System.out.println(listaReceta.get(i));
			}
		} }

	public void mostrarListado() {
		System.out.println("la lista es "+ cocina.getListaReceta());
	}
    
}
