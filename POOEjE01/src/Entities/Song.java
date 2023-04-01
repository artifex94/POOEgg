/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 * Ejercicio Extra 01
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: 
 * uno vacío que inicializa el título y el autor a cadenas vacías 
 * y otro que reciba como parámetros el título y el autor de la canción. 
 * Se deberán además definir los métodos getters y setters correspondientes.
 *
 * @author rami_
 */
public class Song {
    //      Attributes      //
    private String title, author;
    
    //      Methods         //
    
    //Constructors
    public Song() {
    }

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }
  
    //Get's & Set's
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}
