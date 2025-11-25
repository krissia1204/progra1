package tarea;
public class Main{


    public static void main(String[]args){

        Mochila m= new Mochila(10);

        Objeto 00= new Objeto(4,3);
        Objeto 01= new Objeto(2,5);
        Objeto 02= new Objeto(8,2);
        Objeto 03= new Objeto(3,1);
        Objeto 04= new Objeto(5,7);
        Objeto 05= new Objeto(7,9);

        Objeto[] objetos= {00,01,02,03,04,05};

        Solucionador s= new Solucionador(m, objetos);

        System.out.println("Valor maximo =" +s.Llenar());
    }
}