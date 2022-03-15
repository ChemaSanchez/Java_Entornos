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
    public void añadirAnimal(Animal a){
        carrito.add(a);
        if(a instanceof Gato){
            Gato conversion = (Gato)a; //Convertir a variable (Casting)
            for(int i = 0; i< carrito.size(); i++){
                Animal get = carrito.get(i);
                if (get instanceof Pez){
                    Pez p = (Pez)get; //Convertir a variable (Casting)
                    carrito.remove(p);
                    conversion.comer(p);
                }
            }
        }
    }
    
    public int getPrecio(){
        int precioTotal = 0;
        
        for (int i = 0; i< carrito.size(); i++){
            Animal a = carrito.get(i);
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
