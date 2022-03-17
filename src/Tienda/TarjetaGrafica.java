package Tienda;

public class TarjetaGrafica extends Componentes{
    public TarjetaGrafica(String n, double p) {
        super(n,p);
    }

    public boolean esRTX(){
        if (getNombre().startsWith("RTX")){
            return true;
        }
        else return false;
    }
}
