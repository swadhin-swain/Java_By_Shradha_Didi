//return the path of the array by the help of arrayList also going in DIAGONAL

import java.util.*;

    public class Recursion_Qns34 {
    public static ArrayList<String> paths(String path, int row, int col){
        if( row == 1 && col == 1) {
            ArrayList <String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }
        
        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> diagonal = new ArrayList<>();
        //for donwards
        if(row > 1) {
            down = paths(path+"down ", row - 1, col);
        }
        //for rightwards
         if(col >1) {
             right = paths(path + "right ", row, col - 1);
         }
         //for diagonal
         if(row > 1) {
            diagonal = paths(path+"diagonal ", row - 1, col - 1);
        }
         down.addAll(right);
         down.addAll(diagonal);

         return down;
    }

    //another way
    public static ArrayList<String> pathss(String path, int row, int col){
        if( row == 1 && col == 1) {
            ArrayList <String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        //for donwards
        if(row > 1) {
           list.addAll( pathss(path+"down ", row - 1, col));
        }
        //for rightwards
         if(col >1) {
            list.addAll(pathss(path + "right ", row, col - 1));
         }
         //for diagonal
         if(row > 1) {
            list.addAll(pathss(path+"diagonal ", row - 1, col - 1));
        }
        
         return list;
    }
    public static void main(String[] args) {
        System.out.println(pathss("", 3, 3));
    }
}
