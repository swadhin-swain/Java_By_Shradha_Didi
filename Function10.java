//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class Function10 {
    public static int checkTheGreater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //enter two number
        System.err.println("Enter the first number:");
        int num1=p.nextInt();
        System.out.println("Enter the second number:");
        int num2=p.nextInt();
        System.out.println("The greatest number is "+checkTheGreater(num1, num2));
        p.close();
    }
}
