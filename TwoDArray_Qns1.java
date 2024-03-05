/*
 Take a matrix as input from the user.
 Search for a given number x and print the indices at which it occurs.
 */
import java.util.*;
public class TwoDArray_Qns1 {
    public static void main(String[] args) {
        Scanner p=new Scanner (System.in);

        System.out.println("Enter the numbers of rows:");
        int r=p.nextInt();//rows
        System.out.println("Enter the numbers of columns:");
        int c=p.nextInt();//columns

        int [][]numbers=new int[r][c];

        //input the 2D array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the value of numbers["+i+"]["+j+"]:");
                numbers[i][j]=p.nextInt();
            }
        }

         //print the 2D array
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        //enter x
        System.out.println("Enter the value of x:");
        int x=p.nextInt();

        //search for the x.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(numbers[i][j]==x){
                System.out.println("x found at location ("+i+","+j+")");
               }
            }
        }
        p.close();
    }
}
