//check the number is pallindrome or not 
//in this string characer are added with alphabets.
//remove the character and the remaning is alphabets and number

public class Leetcode_Qns18 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for(int i=0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            int ASCII = (int)ch;
            if(ASCII >= 97 && ASCII <= 122 || ASCII >= 48 && ASCII <= 57 ){
                ans = ans+ch;
            }
        }
        int left = 0;
        int right = ans.length() - 1;
        

        // if(s.length()<1){
        //     return true;
        // }
        while (left < right) {
            if(ans.charAt(left) != ans.charAt(right)){

                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";

        System.out.println(isPalindrome(s));
    }
}
