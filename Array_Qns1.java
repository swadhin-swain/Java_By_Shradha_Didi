/*
 Take an array input from the user.
 search for a given number x and print the index at which it occurs.
 */
import java.util.*;
public class Array_Qns1 {
    public static void main(String[] args) {
        Scanner p=new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int size=p.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the value of x:");
        int x=p.nextInt();
        
        //input the element in java
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the value of numbers["+i+"]");
          numbers[i]=p.nextInt();
        }
        //search for the number
        for(int i=0;i<numbers.length;i++){
          if(numbers[i]==x){//Linear search
            System.out.println("x found at index "+i);
           // break;
          }
        }
        p.close();
    }
}
