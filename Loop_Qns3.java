//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;
public class Loop_Qns3 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int r,evensum=0,oddsum=0;
        //enter the number 
        System.out.println("Enter the number:");
        int num=p.nextInt();
        while(num!=0){
          r=num%10;
          if(r%2==0){
            evensum=evensum+r;
          }else{
            oddsum=oddsum+r;
          }
          num=num/10;
        }
        //print the sum of even and odd
        System.out.println("the sum of even integer is "+evensum);
        System.out.println("the sum of odd integer is "+oddsum);
        p.close();
    }
}
