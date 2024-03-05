//find the factorial of a number

public class Recursion_Qns2 {
    public static int calculateFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int fNM1 = calculateFactorial(n-1);//factorial of (n-1)
        int fN = n*fNM1 ;//factorial of n

        return fN;
    }
    public static void main(String[] args) {
        int n = 5;

        int ans = calculateFactorial(n);
        System.out.println("The factorial of "+n+" is "+ans);
    }
}
