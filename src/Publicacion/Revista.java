package Publicacion;

/**
 *
 * @author theli
 */
public class Revista extends Publicacion{
    //Variables:
    private int ejemplar;
    
    //Constructor:
    public Revista(String c, String n, int y, int num){
        super(c, n, y);
        ejemplar = num;
    }
    
    //Métodos:
    public String toString(){
        return super.toString()
                + "\nNº de ejemplar: " +ejemplar;
    }
}
