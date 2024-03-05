//reverse a string
import java.util.*;
public class Strings_Qns3 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //enter a stringbuilder
        System.out.println("Enter a string:");
        String str=p.nextLine();
        StringBuilder sb=new StringBuilder(str);

        //reverse the string
        int n=sb.length();
        for(int i=0;i<n/2;i++){
             int front=i;
             int back=n-i-1;

             char frontChar=sb.charAt(front);
             char backChar=sb.charAt(back);

             //set the index
             sb.setCharAt(front, backChar);
             sb.setCharAt(back, frontChar);
        }
        System.out.println("The reverse string is");
        System.out.println(sb);
        p.close();

        //time complexity = O(n)
    }
}
