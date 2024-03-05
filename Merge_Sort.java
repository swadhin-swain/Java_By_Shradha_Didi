//example of merge sort

public class Merge_Sort {
    //function for deviding the array
    public static void devide(int arr[], int startIndex, int endIndex) {
        //base case - if startIndex is greater than or equal to endingIndex then return
        if(startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        //devide the array
        //1st part
        devide(arr, startIndex, mid);

        //2nd part
        devide(arr, mid + 1, endIndex);

        //after devidingthe array then call for conquering the array
        conquer(arr, startIndex, mid, endIndex);
    }

    //function for conquering the array
    public static void conquer(int arr[], int startIndex, int mid, int endIndex) {
        //create a merged array
        int merged[] = new int[endIndex - startIndex + 1];

        //for tracking two index we can create 2 index
        int index1 = startIndex; //-> which can track 1st index

        int index2 = mid + 1; //->which track 2nd index
        
        //creating another index which can track merged array index
        int indexX = 0;

        //let's starting sorting
        while(index1 <= mid && index2 <= endIndex) {
            //compare the 1st elements of 2 arrays
            if(arr[index1] <= arr[index2]) {
                merged[indexX] = arr[index1];
                //then we can go to next index
                indexX++;
                index1++;
            } else {
                merged[indexX] = arr[index2];
                indexX++;
                index2++;
            }
        }

        //case 2
        //copying the first array into the merged array
        while(index1 <= mid) {
            merged[indexX++] = arr[index1++];
        }

         //copying the 2nd array into the merged array
         while(index2 <= endIndex) {
            merged[indexX++] = arr[index2++];
        }

        //then copying the merged array into original array

        for(int i = 0, j = startIndex; i< merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        //call the devide function
        devide(arr, 0, n - 1);

        // print the array

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
