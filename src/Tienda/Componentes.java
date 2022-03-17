package Tienda;

/**
 *
 * @author Chema
 */
public abstract class Componentes {
    private double precio;
    private String nombre;

    public  Componentes(String n, double p) {
        precio = p;
        nombre = n;
    }

    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
}

