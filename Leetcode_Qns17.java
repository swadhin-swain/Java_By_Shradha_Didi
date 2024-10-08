/*
 Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

public class Leetcode_Qns17 {
    public static String defangIPaddr(String address) {
        String result ="";
        for(int i=0;i<address.length();i++){
          
                if(address.charAt(i)=='.'){
                    result+="[.]";
                }

                if(address.charAt(i)!='.'){
                    result+=address.charAt(i);
                }
        }

        return result;
    }
    public static void main(String[] args) {
         String address = "255.100.50.0";

        System.out.println(defangIPaddr(address));
    }
}
