package Publicacion;

/**
 *
 * @author theli
 */
public class Publicacion {
    //Variables:
    protected String ISBN, nombre;
    protected int año;
    
    //Constructor:
    public Publicacion(String c, String n, int y){
        ISBN = c;
        nombre = n;
        año = y;
    }
    
    //Métodos:
    public String toString(){
        String publicacion = "\n" +nombre
                + "\n=========================="
                + "\nISBN: " +ISBN
                + "\nTítulo: " +nombre
                + "\nAño: " +año;
        
        return publicacion;
    }
}
