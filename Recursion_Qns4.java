// print x^n (stack height = n).

public class Recursion_Qns4 {
    public static int calculatePower(int x, int n){
        if(n == 0){
            return 1; //base case 1
        }
        if(x == 0){
            return 0;  //base case 2
        }
        int xPownm1 = calculatePower(x, n-1); // work
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;

        int ans = calculatePower(x, n);
         System.out.println(ans);
    }
}
