//input the 2D array by the user and print the result
import java.util.*;
public class TwoDArray {
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
        p.close();
    }
}
