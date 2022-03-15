package Tienda;

/**
 *
 * @author Chema
 */
public class Componentes {
    private int precio;
    private String nombre;

    public Componentes(String n, int p) {
        precio = p;
        nombre = n;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
}

