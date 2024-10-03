/*
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

public class Leetcode_Qns25 {
    public static double solve(double x, long n) {
        // base case
        if (n == 0) {
            return 1;
        }

        if (n < 0) { // if n is negative
            return solve(1 / x, -n);
        }

        if (n % 2 == 0) { // if n is even. solved by binary exponetiation
            return solve(x * x, n / 2);
        } else { // //if n is odd. solved by binary exponetiation
            return x * solve(x * x, (n - 1) / 2);
        }
    }

    public static double myPow(double x, int n) {
        return solve(x, (long) n);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 05));
    }
}
