package tarea;
public class Solucionador{
    private Mochila mochilita;
    private Objeto[] losObjetos;

    public Solucionador(Mochila laMochila, Objeto[] Objetos){

        this.mochilita= laMochila;
        this.losObjetos= Objetos;


    }


    public int Llenar(){

        return LlenarRec(0, 0, 0);
    }
    

    private int LlenarRec(int indice, int PesoActual, int valorACtual){

        int vMaxEnctd= 0;

        if (indice==losObjetos.length){

            vMaxEnctd=valorACtual;
        }

        else {

            Objeto actual=losObjetos[indice];

            int valorNoIncld= LlenarRec(indice+1,PesoActual,valorACtual);

            int valorIncld=0;

            if(PesoActual+actual.getPeso()<=mochilita.getPesoMax()){

                valorIncld= LlenarRec(indice+1,PesoActual+actual.getPeso(), valorACtual+actual.getValor());
            }

            vMaxEnctd= Math.max(valorIncld,valorNoIncld);
        }

        return vMaxEnctd;

    }

}