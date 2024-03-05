//print the sum of the digit of the number

public class Recursion_Qns19 {
    public static int sumOfNumber(int n){
        //base case
        if(n == 0){
            return 0;
        }

        return (n % 10) + sumOfNumber(n/10);
    }
    public static void main(String[] args) {
        int number = 1432;
        System.out.println("The sum of digits of "+number+" is "+sumOfNumber(number));
    }
}
