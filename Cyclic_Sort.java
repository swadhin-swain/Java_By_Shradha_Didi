//example of cyclic sort by kunal
import java.util.Arrays;

public class Cyclic_Sort {
    public static void cyclicSort(int arr[]){
        int i = 0;

        while(i < arr.length){
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        //calling the function
        cyclicSort(arr);

        //printing the array
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           }
           System.out.println();

           System.out.println(Arrays.toString(arr));
    }
}
