//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
public class Function13 {
    public static int findGcd(int a,int b){
        //ensure a is greater or equal to b.
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        //find the gcd by eucledian algorithm
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        //return the gcd
        return a;

    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //enter two number for find their gcd.
        System.out.println("Enter first number:");
        int a=p.nextInt();
        System.out.println("Enter second number:");
        int b=p.nextInt();
        //print the gcd.
        System.out.println("The gcd of "+a+" and "+b+" is "+findGcd(a, b));
        p.close();
    }
}
