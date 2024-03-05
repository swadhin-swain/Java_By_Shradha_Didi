
import java.util.Arrays;


public class Merge_sort_By_Kunal {
    public static int[] mergeSort(int arr[]){
        //base case
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(arr,0,mid)); //->left array answer
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); //->right array answer

        return merge(first,second);
    }

    public static int[] merge(int[] first,int[] second) {
        //create a new array which can merge both first and second array
        int mix[] = new int[first.length + second.length];

        int i = 0;//pointing the first array
        int j = 0;//pointing the second array
        int k = 0;//pointing the new array

        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining elements
        while (i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j<second.length) {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int arr[]= {9,8,7,6,5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
