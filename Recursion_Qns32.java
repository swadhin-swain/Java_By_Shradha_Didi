//print the path of the array

public class Recursion_Qns32 {
    public static void paths(String path, int row, int col){
        if( row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if(row > 1) {
            paths(path+"down ", row-1, col);
        }
         if(col >1) {
            paths(path + "right ", row, col - 1);
         }
    }
    public static void main(String[] args) {
        paths("", 3, 3);
    }
}
