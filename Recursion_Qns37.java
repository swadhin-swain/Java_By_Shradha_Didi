//print matrix with path
import java.util.Arrays;

public class Recursion_Qns37 {
    public static void matrixWithPath(String newString, boolean[][] path,int row, int col,int arr[][], int step) {
        if(row == path.length - 1 && col == path[0].length - 1){
            arr[row][col] = step;
            for(int element[]:arr){
                System.out.println(Arrays.toString(element));
            }

            System.out.println(newString);
            System.out.println();
            return;
        }

        ////if the cell is false then return from that cell
        if(! path[row][col]) {
            return;
        }

        //if we can add that cell in our path then convert to false
        path[row][col] = false;
        arr[row][col] = step;

        //going to right
        if(col < path[0].length - 1){
            matrixWithPath(newString+"R", path, row, col+1, arr, step+1);
        }

        //going to down
        if(row < path.length - 1) {
            matrixWithPath(newString+"D", path, row + 1, col, arr, step+1);
        }

        //going to up
        if(row > 0) {
            matrixWithPath(newString+"U", path, row - 1, col, arr, step+1);
        }

        //going to left
        if(col > 0){
            matrixWithPath(newString+"L", path, row, col - 1, arr, step+1);
        }

        //if we can return from that cell then convert to true that celll
        path[row][col] = true;
        arr[row][col] = 0;
    }
    public static void main(String[] args) {
        boolean[][] path = {{true,true,true},
                           {true,true,true},
                           {true,true,true}};

        int arr[][] = new int[path.length][path[0].length];
        matrixWithPath("", path, 0, 0, arr, 1);

    }
}
