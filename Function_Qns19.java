//convert the binary number to decimal number.

import java.util.*;

public class Function_Qns19 {
    public static int binDec(int n){
        int pow=0;//power
        int dec=0;//decimal
        while(n>0){
            int lastDigit=n%10;
            dec=dec+(lastDigit*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);

        System.out.println("Enter the binary number:");
        int bin=p.nextInt();

        System.out.println("The decimal number is "+binDec(bin));
        p.close();
    }
}
