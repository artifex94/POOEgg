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
public class Receta {
	
	private String titulo;
	private String ingrediente;
	private String preparacion;
	
	public Receta() {
	}
	
	public Receta(String titulo, String ingrediente, String preparacion) {
		this.titulo = titulo;
		this.ingrediente = ingrediente;
		this.preparacion = preparacion;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public String getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingrediente=" + ingrediente + ", preparacion=" + preparacion + "]";
	}
}
