//convert decimal to binary

import java.util.*;

public class Function_Qns20 {
    public static void decBin(int n){
        int rem,binNum=0;
       int pow=0;
       while(n!=0){
        rem=n%2;
        binNum+=rem*(int)Math.pow(10,pow);
        n=n/2;
        pow++;
       }
       System.out.println("The binary number is");
       System.out.println(binNum);
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int n=p.nextInt();

        decBin(n);

        p.close();
    }
}
