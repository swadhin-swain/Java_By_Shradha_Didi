//print the path in a maze with obstacle

public class Recursion_Qns35 {

    public static void pathWithObstacle(String newString, boolean arr[][], int row, int col) {
        // base case1
        if (row == arr.length - 1 && col == arr[0].length - 1) {

            System.out.println(newString);
            return;
        }
        // base case 2
        if (!arr[row][col]) {
            return;
        }

        if (row < arr.length - 1) {
            pathWithObstacle(newString + "down ", arr, row + 1, col);
        }

        if (col < arr[0].length - 1) {
            pathWithObstacle(newString + "right ", arr, row, col + 1);
        }
    }

    public static void main(String[] args) {
        boolean[][] arr = { { true, true, true },
                { true, false, true },
                { true, true, true } };

        pathWithObstacle("", arr, 0, 0);
    }
}
