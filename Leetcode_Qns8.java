/*
 Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */

import java.util.Arrays;

public class Leetcode_Qns8 {
    public static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        

        while(start <= end){
            
            int mid = start+(end-start)/2;
            if(nums[mid] == target){

                // Expand the range until the target element is found
                int left=mid;
                while(left>0 && nums[left-1]==target){
                    left--;
                }

                 int right=mid;
                while(right<nums.length-1 && nums[right+1]==target){
                    right++;;
                }
                return new int[]{left,right};
                
            }
            if(nums[mid] > target){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
