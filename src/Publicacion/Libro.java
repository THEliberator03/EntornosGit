/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publicacion;

/**
 *
 * @author iker3
 */
public class Libro extends Publicacion implements Prestable{
  //Variables:
    boolean prestado = false;
    
    //Constructor:
    public Libro(String c, String n, int y){
        super(c, n, y);
        
    }
    
    //Métodos:
    public String toString(){
        return super.toString()
                + "\nEstado: " +prestado;
    }
    
    public void prestar(){
        if(prestado == false){
            prestado = true;
            System.out.println("\nPrestado el libro '" +nombre+ "'.");
        }
        else{
            System.out.println("\nEl libro '" +nombre+ " ya se encuentra prestado.");
        }
    }
    
    public void devolver(){
        prestado = false;
        System.out.println("\nDevuelto el libro '" +nombre+ "'.");
    }  
}
