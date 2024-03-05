//Find the maximum & minimum number in an array of integers. 
import java.util.*;
public class Array_Qns2 {
    public static void main(String[] args) {
        Scanner p=new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int size=p.nextInt();
        int numbers[] = new int[size];
        
        //input the element in array
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the value of numbers["+i+"]");
          numbers[i]=p.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        //find the maximum number
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
         //print the maximum number in array
         System.out.println("The maximum number is "+max);

        //find the minimum number
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        //print the minimum number in array
        System.out.println("The minimum number is "+min);
        p.close();
    }
}
