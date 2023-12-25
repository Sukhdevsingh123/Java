package Sorting;

public class BubbleSort {
    public static void Sorting(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){

                    // Swapping

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void PrintArr(int arr []){
        for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
         int arr[]={5,4,1,3,2};
            Sorting(arr);
            PrintArr(arr);
        //  ...............Steps for buble sort..........
        //  4,5,1,3,2
        //  4,1,5,3,2
        //  4,1,3,5,2
        //  4,1,3,2,5
        //  1,4,3,2,5
        //  1,3,4,2,5
        //  1,3,2,4,5
        //  1,2,3,4,5
    }
    
}
