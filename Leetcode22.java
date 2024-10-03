/*
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 */

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {
     public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list,"",0,0,n);
        return list;
    }

    public static void backTrack(List<String> list,String str,int open ,int close,int n){
        if(str.length()==n*2){
            list.add(str);
            return;
        }

        if(open < n){
            backTrack(list,str+"(",open+1,close,n);
        }

        if(close< open){
            backTrack(list,str+")",open,close+1,n);
        }
    }
    public static void main(String[] args) {
       System.out.println( generateParenthesis(3));
    }
}
