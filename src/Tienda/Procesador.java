package Tienda;

public class Procesador extends Componentes{

    private double temperaturaMaxima;
    private boolean traeDisipador;
    public Procesador(String n, double p,boolean d,double temperaturaMaxima) {
        super(n, p);
        traeDisipador=d;
        this.temperaturaMaxima= temperaturaMaxima;
    }
    public double getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
    public boolean traeDisipador(){
        return traeDisipador;
    }
    
}
