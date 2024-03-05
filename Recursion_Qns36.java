//print all the path in a maze including up and left
//example of back tracking

public class Recursion_Qns36 {
    public static void allPath(String newString, boolean arr[][], int row, int col) {
        //base case1
        if(row == arr.length -1 && col == arr[0].length -1){
    
            System.out.println(newString);
            return;
        }
        //base case 2
        //if the cell is false
        if(!arr[row][col]){
            return;
        }

        //if the cell is not false
        //i am considering this cell in my path
        arr[row][col] = false;

        //going down
        if(row < arr.length -1){
            allPath(newString + "down ", arr, row + 1, col);
        }

        //going right
        if(col < arr[0].length -1){
            allPath(newString + "right ", arr, row , col + 1);
        }

        //going up
        if(row > 0){
            allPath(newString+"up ", arr, row - 1, col);
        }

        //going left
        if(col > 0){
            allPath(newString+"left ", arr, row, col - 1);
        }

        //this line is where the function will be over or returned
        //so function get removed, also removed the changes that were made by my function
        arr[row][col] = true;
    }

    public static void main(String[] args) {
        boolean[][] arr = {{true,true,true},
                           {true,true,true},
                           {true,true,true}};
        allPath("", arr, 0, 0);
    }
}
