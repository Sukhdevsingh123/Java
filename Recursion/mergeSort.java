public class mergeSort {
    public static void divideConquer(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        // left part
        divideConquer(arr, si, mid);

        // right part
        divideConquer(arr, mid+1, ei);

        // call merge function
        merge(arr, si, ei, mid);
    }

 public static void merge(int arr[],int si,int ei,int mid ){
int temp[]=new int [ei-si+1];
int i=si;
int j=mid+1;
int k=0;
while(i<=mid && j<=ei){
    if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
        k++;
    }
    else{
        temp[k]=arr[j];
        j++;
        k++;
    }
    
}
while(i<=mid){
    temp[k++]=arr[i++];
     

while(j<=ei){
    temp[k++]=arr[j++];
    
}
// copy temp arr into original array
for(k=0; k<temp.length; k++){
    arr[i]=temp[k];

}
}
 }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 8, 6 };
        divideConquer(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
