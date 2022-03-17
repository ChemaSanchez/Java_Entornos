/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanmi
 */
public class CarritoCompra{
    private List<Componentes> carrito; 
    private double precioTotal;
    public CarritoCompra() {
        carrito = new ArrayList<>(); // Inicializamos el carrito 
        precioTotal=0; // Inicializamos el pretio total a 0 
    }

    public void añadirComponente(Componentes a){ //Le pasamos un componente como parámetro y lo añadimos al carrito
        carrito.add(a);
    }
    
    public double getPrecio(){
        for (int i = 0; i< carrito.size(); i++){
            Componentes a = carrito.get(i);
            precioTotal += a.getPrecio();
        }
        return precioTotal;
    }

    public void mostrarCarrito(){
        for(int i = 0; i < carrito.size(); i++){
            System.out.println(carrito.get(i).getNombre());
            
        }
    } 
}
