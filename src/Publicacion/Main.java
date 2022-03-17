package Publicacion;

/**
 *
 * @author theli
 */
public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro l2 = new Libro("234567", "Los Otros", 2016);
        Libro l3 = new Libro("345678", "La Rosa del Mundo", 1995);
        
        Revista r1 = new Revista("456789", "Año Cero", 2019, 344);
        Revista r2 = new Revista("567890", "National Geographic", 2003, 255);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(r1);
        System.out.println(r2);
        
        l2.prestar();
        l2.prestar();
        l2.devolver();
        
        l3.prestar();
        System.out.println(l2);
        System.out.println(l3);
    }
}
