//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class Function9 {
    public static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of odd number from 1 to "+n+" is "+sum);
    }

    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=p.nextInt();
        sum(a);
        p.close();
    }
}
