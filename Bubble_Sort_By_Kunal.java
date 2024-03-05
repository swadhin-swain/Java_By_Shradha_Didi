//example if bubble sort by kunal

public class Bubble_Sort_By_Kunal {
    public static void bubbleSort(int [] arr){
        int n= arr.length;//length of the array
        boolean swapped;
        //bubble sort
        for(int i = 0;i < n; i++){
            swapped = false;
            for(int j = 1;j <= n-i-1; j++){
                //swap if the element is smaller than the previous one
               if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
               }
            }
            //if swap can not be occur then break from the loop
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,5,4,3,2,1};

        //call the bubble sort function
        bubbleSort(arr);
        //print the element of the array
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
