//print the product of the digit of the number

public class Recursion_Qns20 {
    public static int productOfNumber(int n){
        //base case
        if(n == 0){
            return 1;
        }

        return (n % 10) * productOfNumber(n/10);
    }
    public static void main(String[] args) {
        int number = 505;
        System.out.println("The product of digits of "+number+" is "+productOfNumber(number));
    }
}
