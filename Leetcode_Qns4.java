//return the length of the longest subString without repeating character

import java.util.ArrayList;
import java.util.List;
public class Leetcode_Qns4 {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();

        int start = 0;
        int end =0;
        int max_length = 0;

        while (end < s.length()) {
            //if the list does not contain the end character in that list
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                //update the end index
                end++;
                //update the maximum length
                max_length = Math.max(max_length, list.size());

            } else {
                //if we have already that character then remove that character from the list
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return max_length;

    }
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
