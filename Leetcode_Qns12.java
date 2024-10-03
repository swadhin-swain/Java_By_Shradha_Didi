/*
 Container With Most Water

 You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].'
' In this case, the max area of water (blue section) the container can contain is 49.
 */

public class Leetcode_Qns12 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        //let's traverse the array and find the maximum Area
        while(left < right) {
            int length = Math.min(height[left], height[right]);
            int breadth = right - left;

            //area is LENGTH * BREADTH
            int area = length * breadth;

            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}
