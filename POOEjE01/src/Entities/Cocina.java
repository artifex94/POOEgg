/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rami_
 */
public class Cocina {

	List<Receta> listaReceta = new ArrayList<>();

	public Cocina() {
	}

	public Cocina(List<Receta> listaReceta) {
		this.listaReceta = listaReceta;
	}

	public List<Receta> getListaReceta() {
		return listaReceta;
	}

	public void setListaReceta(List<Receta> listaReceta) {
		this.listaReceta = listaReceta;
	}

	@Override
	public String toString() {
		return "Cocina [listaReceta=" + listaReceta + "]";
	}
}