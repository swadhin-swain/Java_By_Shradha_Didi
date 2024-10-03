/*
 remove duplicates from the array

 Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class Leetcode_Qns9 {
    public static int removeduplicates(int nums[]){
        int i = 0;

        for(int n : nums){
            //in nums array add the first two element and then compare with the previous two element
            if(i < 2 || n != nums[i-2]){
                nums[i] = n;
                i++;
            }
        }
        
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        System.out.println(removeduplicates(nums));
    }
}
