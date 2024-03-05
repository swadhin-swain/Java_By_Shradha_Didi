//print x^n (stack height = log n)

public class Recursion_Qns5 {
    public static int printPower(int x, int n){
        if(x == 0){
            return 0; //base case 1
        }
        if(n == 0){
            return 1; //base case 2
        }

        //if the power is even
        if(n % 2 == 0){
            return printPower(x, n/2) * printPower(x, n/2);
        } else {
            return printPower(x, n/2) * printPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int ans = printPower(2, 6);

        System.out.println(ans);
    }
}
