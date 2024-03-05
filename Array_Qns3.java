//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;
public class Array_Qns3 {
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
          boolean isAscending=true;

          //check the array is sorted in ascending order
          for(int i=0;i<numbers.length-1;i++){
           if(numbers[i]>numbers[i+1]){
            isAscending=false;
           }
          }
          //print the array is sorted in ascending order or not
          if(isAscending){
            System.out.println("The array is sorted in ascending order.");
          }else{
            System.out.println("The array is not sorted in ascending order.");
          }
          p.close();
        }
    }

