//print the sum of first natural numbers.
import java.util.*;
public class Loop_Qns1 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the value of n");
       int n=p.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++){
         sum=sum+i;  
       } 
       System.out.println("The sum is "+sum);
       p.close();
    }
}
