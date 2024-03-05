//find the binomial coefficient of a number means combination of two two number.
import java.util.*;
public class Function_Qns15 {
    //This function find the factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
//this function call the factorial function to calculate different factorial.
    public static int binomCoeff(int n,int r){
        int factn=factorial(n);
        int factr=factorial(r);
        int factnMr=factorial(n-r);

        int bincof=factn/(factr*factnMr);
        
        return bincof;
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //enter the two number
        System.out.println("Enter the value of n:");
        int n=p.nextInt();
        System.out.println("Enter the value of r:");
        int r=p.nextInt();

        //print the combination.
        System.out.println("The combinatin of "+n+" and "+r+" is "+binomCoeff(n, r));
        p.close();
    }
}
