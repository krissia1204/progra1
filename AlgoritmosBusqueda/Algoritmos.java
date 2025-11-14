import java.util.Scanner;
public class Algoritmos{

    public int linearSearch(int arr[], int num){

        for (int i= 0; i<arr.length; i++){
            if (arr[i]==num){
                return i;
            }
      
        }
        return -1;
    }

    public int binarySearch(int arr[],int low, int high, int num){
       
       
        if(high>=low){
            int mid= low + (high - low)/2;

            if(arr[mid]==num){
                return mid;
            }

            if(arr[mid]>num){
                return binarySearch(arr, low, mid-1, num);
            }
              return binarySearch(arr,mid+1, high, num);
        }
        return -1;
      
    }

    public void bubbleSort(int arr[]){
        int n= arr.length;
        for (int i=0; i<n-i-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }


        }
    }

    public void selectionSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp= arr[min_idx];
            arr[min_idx]= arr[i];
            arr[i]= temp;
        }
    }


    public void insertionSort(int arr[]){
        int temp;
        for(int i=1;i<arr.length;i++){
            for (int j=i; j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Algoritmos agrt= new Algoritmos();
        Scanner sc= new Scanner(System.in);
        int arr[]= {12,10,70,35,74,32,1,0};
        System.out.println("Bienvenido, ¿Qué desea acción realizar? "
                + "\n1. Probar algoritmo de busqueda lineal"
                + "\n2. Probar algorito de busqueda binaria"
                + "\n3. Probar algoritmo de selección"
                + "\n4. Probar algoritmo de burbuja"
                + "\n5. Probar algoritmo de inserción"
                + "\n6. Salir");

        int opcion= sc.nextInt();

        if (opcion<1|| opcion>5){

            System.out.println("Digite una opción valida");
        }

        else {

            while (opcion!=6){

                switch (opcion){

                    case 1:
                        System.out.println("Digite el número que desea buscar dentro del arreglo: ");
                        int num= sc.nextInt();
                        int result= agrt.linearSearch(arr, num);
                        if (result == -1){
                            System.out.println("El número no se encuentra en el arreglo");
                        }
                        else {
                            System.out.println("El número se encuentra en el indice: " + result);
                        }

                        break;
                        
                        


                    case 2:
                       System.out.println("Digite el número que desea buscar dentro del arreglo: ");
                        num= sc.nextInt();
                        int high= arr.length -1;
                        //primero ordenamos el arreglo, binary search solo funciona en arreglos ordenados.
                        agrt.bubbleSort(arr);
                        result= agrt.binarySearch(arr, 0, high, num);
                        if (result == -1){
                            System.out.println("El número no se encuentra en el arreglo");
                        }
                        else {
                            System.out.println("El número se encuentra en el indice: " + result);
                            
                        }

                        break;
                    case 3:
                        System.out.println("Arreglo original: ");
                        printArray(arr);
                        agrt.selectionSort(arr);
                        System.out.println("Arreglo ordenado: ");
                        printArray(arr);
                        break;

                    case 4:
                        System.out.println("Arreglo original: "); 
                        printArray(arr);
                        agrt.bubbleSort(arr);
                        System.out.println("Arreglo ordenado: ");
                        printArray(arr);

                        break;
                    case 5:
                        System.out.println("Arreglo original: ");
                        printArray(arr);
                        agrt.insertionSort(arr);
                        System.out.println("Arreglo ordenado: ");
                        printArray(arr);

                    }
                System.out.println("¿Qué desea acción realizar? "
                        + "\n1. Probar algoritmo de busqueda lineal"
                        + "\n2. Probar algorito de busqueda binaria"
                        + "\n3. Probar algoritmo de selección"
                        + "\n4. Probar algoritmo de burbuja"
                        + "\n5. Probar algoritmo de inserción"
                        + "\n6. Salir");
                    opcion= sc.nextInt();
                }
                System.out.println("Gracias por usar el programa. Hasta luego!");


                    
                }}

                    
                    
                        
            }
