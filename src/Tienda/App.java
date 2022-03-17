package Tienda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TarjetaGrafica gtx= new TarjetaGrafica("GTX 1650", 250);
        TarjetaGrafica gtx2= new TarjetaGrafica("GTX 1660", 325);
        TarjetaGrafica rtx= new TarjetaGrafica("RTX 2060", 420);
        Procesador r3= new Procesador("Ryzen 3", 140, true, 95);
        Procesador r5= new Procesador("Ryzen 5", 230, true, 105);
        Procesador r7= new Procesador("Ryzen 7", 350, false, 85);
        Procesador[] procesadores= {r3,r5,r7};
        TarjetaGrafica[] tarjetas= {gtx,gtx2,rtx};
        int a,eleccion,contador;
        CarritoCompra carrito= new CarritoCompra();
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenido a nuestra tienda");
        System.out.println("¿Qué desea hacer?");
        do{
            System.out.println("1.- Compra una tarjeta gráfica.");
            System.out.println("2.- Compra un procesador");
            System.out.println("3.- Consulta el precio y los componentes del carrito");
            System.out.println("4.- Finalizar la compra.");
            a= sc.nextInt();
            switch (a){
                case 1:
                contador=1;
                System.out.println("¿Qué modelo de tarjeta gráfica quieres?");
                for(TarjetaGrafica c: tarjetas){
                    System.out.println(contador+" .-"+c.getNombre());
                    contador++;
                }
                eleccion= sc.nextInt();
                switch (eleccion){
                    case 1:
                        carrito.añadirComponente(tarjetas[0]);
                        System.out.println("Tu tarjeta "+tarjetas[0].getNombre()+" ha sido comprada con éxito.");
                        break;
                    case 2:
                        carrito.añadirComponente(tarjetas[1]);
                        System.out.println("Tu tarjeta "+tarjetas[1].getNombre()+" ha sido comprada con éxito.");
                        break;
                    case 3:
                        carrito.añadirComponente(tarjetas[2]);
                        System.out.println("Tu tarjeta "+tarjetas[2].getNombre()+" ha sido comprada con éxito.");
                        break;  
                    default:
                        System.out.println("No te he entendido, vuelve a intentarlo por favor.");    
                }
                break;
                case 2:
                    contador=1;
                    System.out.println("Que tipo de procesador quieres?");
                    for(Procesador p: procesadores){
                        System.out.println(contador+" .-"+p.getNombre());
                        contador++;
                    }
                    eleccion=sc.nextInt();
                        switch(eleccion){
                            case 1:
                                carrito.añadirComponente(procesadores[0]);
                                System.out.println("Tu procesador"+procesadores[0].getNombre()+" ha sido comprado con éxito");
                                break;
                            case 2:
                                carrito.añadirComponente(procesadores[1]);
                                System.out.println("Tu procesador "+procesadores[1].getNombre()+" ha sido comprado con éxito");
                                break;
                            case 3:
                                carrito.añadirComponente(procesadores[2]);
                                System.out.println("Tu procesador "+procesadores[2].getNombre()+" ha sido comprado con éxito");
                                break;
                            default:
                            System.out.println("No te he entendido, vuelve a intentarlo por favor.");
                        }
                break;
                case 3:
                        System.out.print("Tienes en el carrito los siguientes articulos: ");
                        System.out.println("");
                        carrito.mostrarCarrito();
                        System.out.println("");
                        System.out.println("El precio de estos componentes asciende a "+carrito.getPrecio()+" euros");
                break;
            }
        }while (a!=4);

    }
}
