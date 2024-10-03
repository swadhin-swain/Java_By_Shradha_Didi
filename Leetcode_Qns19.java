/*
 Reverse Integer

 Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

 Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */

public class Leetcode_Qns19 {
    public static int reverse(int x) {
        int reverse = 0;

        while(x != 0){
            //reversing the number
            int rem = x%10;
            reverse = reverse * 10 + rem;
            x = x/10;
        }

               //checking the integer overflow
               if(reverse > (Integer.MAX_VALUE/10) || reverse < (Integer.MIN_VALUE/10)){
                return 0;
            }

        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1200000004));
    }
}
