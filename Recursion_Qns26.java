//find the element in rotated array using binary search

public class Recursion_Qns26 {
    public static int search(int arr[], int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        //case 1
        //check the first part of the array is sorted or not
        if(arr[start] <= arr[mid]){
            //check the target is in the sorted part or not
            if(target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        if(target >=arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        int target = 8;

        System.out.println("The ingex of the "+target+" is "+search(arr, target, 0, arr.length-1));
        
    }
}
