//find the magic number

public class Math_Qns1 {
    public static void main(String[] args) {
        int ans = 0;
        int base = 5;
        int n = 3;

        while(n > 0){
            int currBit = n & 1;
            ans = ans + currBit * base;
            base *= 5;
            n = n >> 1;
        }

        System.out.println(ans);
    }
}
