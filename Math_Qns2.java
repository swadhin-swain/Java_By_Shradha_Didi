//find the number of digits in any base

public class Math_Qns2 {
    public static void main(String[] args) {
        int number = 10;

        int base = 2;

        int ans = (int)(Math.log(number)/Math.log(base)) + 1;

        System.out.println(ans);
    }
}
