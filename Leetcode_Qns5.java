/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Leetcode_Qns5 {
    public static void rotate(int nums[],int k){
        int n = nums.length;
        int arr[]=new int[n];

        k=k%nums.length;

        for(int i=0;i<k;i++){
            arr[i] = nums[n + i -k];
        }

        for(int i=0 ; i < n-k ; i++){
            arr[i + k] = nums[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //or

    public static void rotate2(int nums[], int k) {
        int n = nums.length;
        k = k % n;//because the length of the array is not go to out of bound

        if(k < 0){ 
            k += nums.length;
        }
        //reverse the first half
        reverse(nums, 0, k);

        //reverse the second half
        reverse(nums, k+1, n - 1);

        //reverse the whole array
        reverse(nums,0,n-1);
    }

    public static void reverse(int nums[], int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;

        rotate2(nums, k);
        //printing the rotated array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
