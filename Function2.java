//make a function to add two numbers and return the sum.
import java.util.*;
public class Function2 {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       //input two number
       System.out.println("Enter the value of first number:");
       int a=p.nextInt();
       System.out.println("Enter the value of second number:");
       int b=p.nextInt();
       System.out.println("The sum of first & second number is "+sum(a,b));
       p.close();

    }
}
