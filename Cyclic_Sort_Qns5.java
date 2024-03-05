//find all the duplicate element in the array
import java.util.Arrays;
public class Cyclic_Sort_Qns5 {
    public static int[] duplicateElements(int arr[]){
          int i = 0;
          while(i<arr.length){
            int correctIndex = arr[i]-1;

            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
          }
          //find the all duplicate numbers
          for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[]{arr[index],index+1};
            }
          }
          return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[]= {1,2,2,4};
        System.out.println(Arrays.toString(duplicateElements(arr)));
    }
}
