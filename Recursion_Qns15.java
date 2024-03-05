//count total path in a maze

public class Recursion_Qns15 {
    public static int countPaths(int i, int j, int n, int m){
        //base condition
        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        //first we can count the downwards moves
        int downwardPaths = countPaths(i+1, j, n, m);

        //then we can count the right side moves
        int rightSidePaths = countPaths(i, j+1, n, m);

        return downwardPaths + rightSidePaths;
    }
    //Another way
    public static int maze(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int right = maze(row, col - 1);
        int down = maze(row - 1, col);

        return right + down;
    }
    public static void main(String[] args) {
        int n = 4, m = 4;

        //print the number of paths
        System.out.println("The number of paths are "+countPaths(0, 0, n, m));

        System.out.println(maze(4, 4));
    }
}
