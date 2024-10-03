/*
 Given a string s consisting of words and spaces, return the length of the last word in the string.

 Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
 */

public class Leetcode_Qns16 {
    public static int lengthOfLastWord(String s) {
        int count =0;

        for(int i=s.length()-1;i>=0;i--){
            //a letter is found so count
            if(s.charAt(i)!=' '){
                count++;
            }else{
                //a space is occur
                //so we found the last word
                if(count>0){
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
    }
}
