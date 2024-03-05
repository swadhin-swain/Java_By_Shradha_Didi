//binary search

import java.util.*;
public class Array_qns6 {
    public static int binarySearch(int numbers[],int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid=(start + end)/2; //found

            //comparison
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){ //right
                start=mid+1;
            } else { //left
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int numbers[] = {2,4,6,8,10,12,14};

        System.out.println("Enter the key for found in array:");
        int key = p.nextInt();

        //call the binary search function
        int index=binarySearch(numbers, key);

        if(index == -1){
            System.out.println("The key is not found.");
        } else {
            System.out.println("Index for key is "+index);
        }

        p.close();
    }
}
