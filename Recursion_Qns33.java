//return the path of the array by the help of arrayList

import java.util.*;

    public class Recursion_Qns33 {
    public static ArrayList<String> paths(String path, int row, int col){
        if( row == 1 && col == 1) {
            ArrayList <String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }
        
        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(row > 1) {
            down = paths(path+"down ", row-1, col);
        }
         if(col >1) {
             right = paths(path + "right ", row, col - 1);
         }
         down.addAll(right);

         return down;
    }
    public static void main(String[] args) {
        System.out.println(paths("", 3, 3));
    }
}
