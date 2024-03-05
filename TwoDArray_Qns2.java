//For a given matrix of N x M, print its transpose.
import java.util.Scanner;

public class TwoDArray_Qns2 {
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
         System.out.println("The matrix is");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //print the transpose
        System.out.println("The transpose of the matrix is");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(numbers[j][i]+" ");
            }
            System.out.println();
        }
        p.close();
    }
}
