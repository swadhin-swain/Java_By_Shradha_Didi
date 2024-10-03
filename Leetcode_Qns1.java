//maximum binary number
//ex->if the array is [0,1,0] then convert to [0,0,1] & [1,0,1,1,0]->[1,1,0,0,1]

public class Leetcode_Qns1 {
    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();

        int count1=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1'){
                count1++;
            }
        }

        for(int i = 1; i < count1; i++){
            sb.append("1");
        }

        for(int i=count1;i<s.length();i++) {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }

    //or 
    public static String maximumOddBinaryNumber2(String s) {
        String ans = "";
        int count1 = 0;

        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) == '1') {
                count1++;
            }
        }
        int count0 = s.length() - count1;

        for(int i = 0; i < count1 - 1; i++){
            ans += "1";
        }

        for(int i = 0; i < count0; i++){
            ans += "0";
        }

        ans+="1";

        return ans;

        }
    
    public static void main(String[] args) {
        String s = "1000011";

        // String ans = maximumOddBinaryNumber(s);
        // System.out.println(ans);

        System.out.println(maximumOddBinaryNumber2(s));
    }
}
