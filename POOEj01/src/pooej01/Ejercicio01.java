/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Persona;
import Entidad.Libro;
import java.util.Scanner;
/**
 *
 * @author rami_
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Libro libroDisponible = new Libro(12345, 969, "cuentito", "Tu vieja");
        
        System.out.println("Ingrese su nombre, fecha de nacimiento y dni");
        Persona login = new Persona();
        Persona usuario = new Persona("Ramiro", 181194,38557350);
        
        
        System.out.println("Ingreese su Nombre");
        login.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento ddmmaa");
        System.out.print("Fecha: " + "\n");
        login.setFechaNacimiento(leer.nextInt());
        
        System.out.println("Nombre LogIn: " + login.getNombre());
        System.out.println("");
    }
    
}
