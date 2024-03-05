//check the nimber is power of 2 or not

public class Math_Qns4 {
    public static void main(String[] args) {
        int number = 1024;
        boolean ans = (number & (number-1)) == 0;

        System.out.println(ans);
    }
}
