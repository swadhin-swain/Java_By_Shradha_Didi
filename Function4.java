//find the factorial of a number.
import java.util.*;
public class Function4 {
    public static int factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
          fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int a=p.nextInt();
        System.out.println("The factorial of number is "+factorial(a));
        p.close();

    }
}
