/*
 Longest Common Prefix

 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

import java.util.Arrays;

public class Leetcode_Qns14 {
    public static String longestCommonPrefix(String[] strs) {
        //first we can sort the array
        Arrays.sort(strs);

        //take the first and last element of the array then compare them
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        StringBuilder result = new StringBuilder();
        //comparing the arrays
        for(int i =0;i<first.length;i++){
            
            if(first[i] != last[i]){
                break;
            }
            result.append(first[i]);
        }
        if(result.length() == 0){
            return "";
        } else {
            return result.toString();
        }
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
