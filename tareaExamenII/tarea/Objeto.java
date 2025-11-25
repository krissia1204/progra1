package tarea;
public class Objeto{

    private int valor;
    private int peso;

    public Objeto(int elPeso, int elValor) {

        this.valor= elValor;
        this.peso= elPeso;
    }


    public int getPeso()
        {
    return this.peso;
        }  

     public int getValor()
        {
    return this.valor;
        } 

}