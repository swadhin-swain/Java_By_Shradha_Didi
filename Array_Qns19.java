//search the target in 2D array and maximum number in the 2d array
import java.util.Arrays;

public class Array_Qns19 {
public static int[] search(int arr[][],int target){
    for(int i = 0; i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            if(arr[i][j] == target){
                return new int[]{i,j};
            }
        }
    }

    return new int[]{-1,-1};
}
//function for maximum number in 2D array
public static int maximum(int arr[][]){
    int max=Integer.MIN_VALUE;
    for(int i = 0; i<arr.length;i++){
        for(int j = 0;j<arr[i].length;j++){
            if(arr[i][j] > max){
               max = arr[i][j];
            }
        }
    }
    return max;
}

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6,7},
                       {8,9,0}};
        int target = 7; 
        int[] ans = search(arr, target); 
        System.out.println(Arrays.toString(ans)); 
        System.out.println("The maximum number in 2D ARRAY IS "+maximum(arr));            
    }
}
