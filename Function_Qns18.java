//print the first n prime numbers

import java.util.*;
public class Function_Qns18 {
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
        System.out.println("Enter the number of prime number you want to print:");
        int n = p.nextInt();
        int x = 2;
        System.out.println("The first "+n+" prime number are");
        while(n>0){
            if(isPrime(x)==true){
                System.out.print(x+" ");
                n--;
            }
            x++;
        }
        p.close();
    }
}
