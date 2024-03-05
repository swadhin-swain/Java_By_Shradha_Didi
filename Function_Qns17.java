//print the prime number in a range.

import java.util.*;

public class Function_Qns17 {
    public static void primeRange(int n){
        //call the isPrime function for checking the prime number between the range.
        int count=0;//for counting prime number

        //print the prime number
        System.out.println("The prime number between 1 to "+n+" is ");
        for(int i=2;i<=n;i++){
            if(isPrime(i) == true){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.printf("\nThere are "+count+" prime numbers between 1 to "+n+".");
    }

    public static boolean isPrime(int n){
        //corner case
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //enter the range
        System.out.println("Enter the range to print the prime number:");
        int range=p.nextInt();

        //call the function
        primeRange(range);
        p.close();
    }
}
