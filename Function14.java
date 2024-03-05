/*
Two numbers are entered by the user, x and n.
Write a function to find the value of one number raised to the power of another i.e. xn.
 */
import java.util.*;
public class Function14 {
    public static int calculatePowerByLoop(int a,int b){
          //a=base,b=exponent
          int result=1;
          for(int i=1;i<=b;i++){
             result=result*a;
          }
          return result;
    }
    //power function.
    public static int calculatePowerByPowerFunction(int a,int b){
        //a=base,b=exponent
        double result=Math.pow(a, b);
        return (int)result;
    }
    public static void main(String[] args) {
      Scanner p=new Scanner(System.in);
      //enter the base and exponent.
      System.out.println("Enter the base:");
      int base=p.nextInt();
      System.out.println("Enter the exponent:");
      int exponent=p.nextInt();
      //print the result by the help of loop
      System.out.println("The result is "+calculatePowerByLoop(base,exponent));
      System.out.println("The result is "+calculatePowerByPowerFunction(base,exponent));
      p.close();

    }
}
