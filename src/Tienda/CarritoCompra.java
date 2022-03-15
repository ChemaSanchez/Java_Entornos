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
 * @author Chema
 */
public class CarritoCompra{
    
    private List<Componentes> carrito;

    public CarritoCompra() {
        carrito = new ArrayList<>();
    }
    
    //si añado un gato se come a los peces del carrito
    public void añadirAnimal(Componentes a){
        carrito.add(a);
    }
    
    public int getPrecio(){
        int precioTotal = 0;
        
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
