/*
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

 import java.util.Arrays;
 //brute force solution
public class Leetcode_Qns7 {
    public static int majorityElement(int[] nums) {
        int majorityElement = -1;
        int maxCount = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i < n; i++){
            int currCount = 0;

            // Count occurrences of nums[i] in the array
            for(int j = 0;j < n;j++){
               if (nums[j] == nums[i]) {
                currCount++;
               }
            }

            // Check if the current element is the majority element
            if (currCount > maxCount) {
                maxCount = currCount;
                majorityElement = nums[i];
            }
        }
       
        // Validate if the majority element occurs more than n/2 times
         if (maxCount > nums.length / 2) {
            return majorityElement;
        } else {
            return -1; // No majority element found
        }
    }

    //another way
    public static int majorityElement2(int[] nums) {
        //first sorting the array
        Arrays.sort(nums);
        int n = nums.length;

        //then return the middle element beacuse the majority element is present more than the n/2
        return nums[n/2];
    }

    //moore's voting algorithm
    public static int majorityElement3(int[] nums) {
        int ansIndex = 0;
        int count = 1;
        int n = nums.length;

        for(int i = 1; i < n;i++) {
            if(nums[ansIndex] == nums[i]){
                count++;
            } else {
                count--;
            }

            if(count ==0 ) {
                ansIndex = i;
                count = 1;
            }
        }

        //check the ansIndex element is present more than n/2 in that array
        count =0;
        for(int i = 0; i < n; i++){
            if (nums[i] == nums[ansIndex]) {
                count++;
            }
        }

        if(count > (n/2)){
            return nums[ansIndex];
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement3(nums));
    }
}
