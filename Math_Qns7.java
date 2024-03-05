//print the factors of a number in optimized way not in brute force way

import java.util.ArrayList;
public class Math_Qns7 {
    public static void printFactors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                if(n % i == i){
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }

         //printing the array list in reverse
         for(int i = list.size() - 1; i>=0; i-- ){
            System.out.print(list.get(i)+" ");
         }
         System.out.println();
    }
    public static void main(String[] args) {
        int n = 100;

        printFactors(n);
        System.out.println("Time complexity is O(sqrt(n)).");
    }
}
