/*
print the pattern 
****
***
**
*
 */

public class Recursion_Qns27 {
    public static void printPattern(int row, int column){
        //base case
        if(row == 0){
            return;
        }

        if(row > column){
            System.out.print("*");
            printPattern(row , column + 1);
        } else {
            System.out.println();
            printPattern(row - 1, 0);
        }
    }
/*
print the pattern 
*
**
***
****
 */
    public static void printPattern2(int row, int column){
        //base case
        if(row == 0){
            return;
        }

        if(row > column){
            printPattern2(row , column + 1);
            System.out.print("*");
        } else {
            printPattern2(row - 1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(4, 0);
        printPattern2(4, 0);
    }
}
