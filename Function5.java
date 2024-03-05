//Make a function to check if a number is prime or not.
import java.util.*;
public class Function5 {
    public static void checkPrimeNumber(int x){
       int count=0;
       
       for(int i=1;i<=x;i++){
        if(x%i==0){
            count++;
        }
       }
       if(count==2){
        System.out.println(x+" is prime number.");
       }else if(x==1){
        System.out.println(x+" is special number.");
       }
       else{
        System.out.println(x+" is not prime number.");
       }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //entre the number 
        System.out.println("Enter the number for checking:");
        int a=p.nextInt();
        checkPrimeNumber(a);
        p.close();
    }
}
