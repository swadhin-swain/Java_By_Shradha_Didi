//check the number is prime or not

import java.util.*;

public class Function_Qns16 {
    
    //only for n>=2
    // public static boolean isPrime(int n){
    //     //corner case
    //     if(n==2){
    //         return true;
    //     }
    //     boolean isPrime=true;
    //     for(int i=2;i<n;i++){
    //         if(n % i== 0){
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    
    //optimize approach to check prime number.
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
        System.out.println("Enter the number:");
        int n = p.nextInt();
        //check the number is prime or not
        if(isPrime(n) == true){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is nota prime number.");
        }
        p.close();
    }
}
