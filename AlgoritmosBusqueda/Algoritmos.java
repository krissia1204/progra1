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
   
        }
        return binarySearch(arr, mid+1, high, num);
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
        int arr[]= {12,10,70,35,74,32,1,0};

        

    }

}

