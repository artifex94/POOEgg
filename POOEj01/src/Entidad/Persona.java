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
public class Persona {
    // atributos
    private String nombre;
    
    private int fechaNacimiento;
    
    private int dni;
    
    // constructores

    public Persona() {
    }
     public Persona(String nombre, int fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }
    
    // métodos propios
     public String getNombre (){
         return nombre;
     }
     
     public void setNombre(String nombre){
         this.nombre = nombre;
     }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}

