//make a function to multiply two numbers and return the product.
import java.util.*;
public class Function3 {
    public static int calculateProduct(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       //input two number
       System.out.println("Enter the value of first number:");
       int a=p.nextInt();
       System.out.println("Enter the value of second number:");
       int b=p.nextInt();
       System.out.println("The product of first & second number is "+calculateProduct(a,b));
       p.close();

    }
}