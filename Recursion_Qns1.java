//calculate the sum of first n natural numbers.

public class Recursion_Qns1 {
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum  += i;
            System.out.println("The sum of first "+n+" natural number is "+sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1, 10, 0);
    }
}
