package Tienda;

public class TarjetaGrafica extends Componentes{
    public TarjetaGrafica(String n, double p) {
        super(n,p);
    }

    public boolean esRTX(){
        boolean esRTX = false;
        if (getNombre().startsWith("RTX")){
            esRTX = true;
        }
        return esRTX;
    }
}
//soy tony