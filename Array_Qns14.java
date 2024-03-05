//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class Array_Qns14 {

    public static boolean check(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size=p.nextInt();

        int numbers[]=new int[size];
        System.out.println("Enter the value of element of the array");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=p.nextInt();
        }

        if(check(numbers)==true){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        p.close();
    }
}
