/*
 You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.

Return the string that represents the kth largest integer in nums.

Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.

 

Example 1:

Input: nums = ["3","6","7","10"], k = 4
Output: "3"
Explanation:
The numbers in nums sorted in non-decreasing order are ["3","6","7","10"].
The 4th largest integer in nums is "3".
Example 2:

Input: nums = ["2","21","12","1"], k = 3
Output: "2"
Explanation:
The numbers in nums sorted in non-decreasing order are ["1","2","12","21"].
The 3rd largest integer in nums is "2".
Example 3:

Input: nums = ["0","0"], k = 2
Output: "0"
Explanation:
The numbers in nums sorted in non-decreasing order are ["0","0"].
The 2nd largest integer in nums is "0".
 */

import java.util.Arrays;
public class Leetcode_Qns21 {
    public static String kthLargestNumber(String[] nums, int k) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
       int newArray[] = devide(arr);//call the mergesort function

       
       return Integer.toString(newArray[newArray.length - k ]);
    }

    public static int[] devide(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = devide(Arrays.copyOfRange(arr, 0, mid));
        int[] second = devide(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(first,second);
    }

    public static int[] merge(int[] first,int[] second){
        int mix[] = new int[first.length + second.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                k++;
            } else {
                mix[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length ) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while ( j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
       String nums[] = {"2","21","12","1"};
       int k = 3;
       System.out.println(kthLargestNumber(nums, k));
    }
}
