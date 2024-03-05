
/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....

 */
import java.util.*;
public class Function12 {
    public static void printFibonacci(int x){
     int a=0,b=1;
     System.out.print(a+" ");
     System.out.print(b+" ");
     int sum;
     for(int i=2;i<x;i++){
        sum=a+b;
        System.out.print(sum+" ");
        a=b;
        b=sum;
     }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the number of term you want to print:");
        int n=p.nextInt();
        printFibonacci(n);
        p.close();
    }
}