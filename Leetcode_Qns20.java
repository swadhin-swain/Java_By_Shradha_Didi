/*
 Given an integer n, return true if it is a power of three. Otherwise, return false

 Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
 */

public class Leetcode_Qns20 {

    //solving using recursion
    public static boolean isPowerOfThree(int n){
        if(n==1){
            return true;
        }
        if(n%3 != 0 || n==0){
            return false;
        }

        return isPowerOfThree(n/3);
    }

    //solving using loop
    public static boolean isPowerOfThree2(int n){
        while (n>1) {
            if(n%3 != 0 || n==0){
                return false;
            }
            n=n/3;
        }
        return true;
    }

    //solving using loop in another way
    public static boolean isPowerOfThree3(int n){
        int ans = 1;
        while (ans <= n) {
            if(ans == n ){
                return true;
            }
            ans*=3;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree3(27));
    }    
}
