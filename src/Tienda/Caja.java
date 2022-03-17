package Tienda;


/**
 *
 * @author Mario
 */
public class Caja{
    
    private int billetes50;
    private int billetes20;
    private int billetes10;
    private int billetes5;
    private double monedas;

    public Caja() {
        billetes50=0;
        billetes20=0;
        billetes10=0;
        billetes5=0;
        monedas=0;
    }
    public String pago(int d){
        int resto=0;
        int dinero=d;
        if(d%50 >0){
            billetes50=dinero/50;
            resto=dinero%50;
        }
        if(resto%20>0){
            billetes20=resto/20;
            resto=resto%20;
        }
        if(resto%10>0){
            billetes10=resto/10;
            resto=resto%10;
        }
        if(resto%5>0){
            billetes5=resto/5;
            resto=resto%5;
        }
        if(resto%2>0){
            monedas=resto;
        }
        return "La caja tiene "+billetes50+" billetes de 50, "+billetes20+" de 20, "+billetes10+" de 10, "+billetes5+" de 5 y "+monedas+" euros" ;
    }
}
//cddddddddd