//remove the duplicates from the sorted array
//ex:[1,1,2,2,3,4,5,5,5] convert to [1,2,3,4,5,_,_,_,_] and return the length of the new array

public class Leetcode_Qns2 {
    public static int removeDuplicates(int[] arr) {
        //taking a pointer
        int ptr = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[ptr] != arr[i]) {
                // arr[ptr + 1] = arr[i];
                // ptr++;
                //or
                arr[++ptr]=arr[i];
            }
        }

        for(int i = 0; i < arr.length-1; i++) {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        return ptr + 1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
}
