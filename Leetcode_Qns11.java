public class Leetcode_Qns11 {
    public static String longestPalindrome(String s) {
        if(s.length() <= 1){ // because the string contain one character or nothing
            return s;
        }
        String result = "";

        for(int i = 1;i < s.length(); i++) {
            //taking the odd length palliandromic substring
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                
                //if the index reach to bound then break
                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String pallindrome = s.substring(low + 1 , high);
            //check the longest palliandromic subString
            if(pallindrome.length() > result.length()){
                result = pallindrome;
            }

             //taking the even length palliandromic substring
             low = i - 1;
             high = i;
 
             while (s.charAt(low) == s.charAt(high)) {
                 low--;
                 high++;
                 
                 //if the index reach to bound then break
                 if(low == -1 || high == s.length()){
                     break;
                 }
             }

             pallindrome = s.substring(low+1, high);
             if(pallindrome.length() > result.length()){
                result = pallindrome;
             }
        }

        return result;

    }
    public static void main(String[] args) {
        String s = "ABRBADAADAB";

        System.out.println(longestPalindrome(s));
    }
}
