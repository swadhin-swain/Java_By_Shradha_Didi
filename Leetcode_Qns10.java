/*
Minimum Common Value

Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
 */

public class Leetcode_Qns10 {
    public static int getCommon(int[] nums1, int[] nums2) {
        int nums1Start = 0;
        int nums2Start = 0;

        while(nums1Start < nums1.length && nums2Start < nums2.length){
            //if first array start index is equal to second array start index then that is the answer
            if(nums1[nums1Start] == nums2[nums2Start]){
                return nums2[nums2Start];
            } else {
                //if first array start index is less than second array start index then increase the index of the first array
                if(nums1[nums1Start] < nums2[nums2Start]) {
                    nums1Start++;
                } else { //increase the index of second array
                    nums2Start ++;
                }
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int nums1[]={5,7,9};
        int nums2[]={3,7,9};
        System.out.println(getCommon(nums1, nums2));
    }
}
