//find all the position of an element

import java.util.*;
public class Recursion_Qns25 {

    public static ArrayList<Integer> findPosition(int arr[], int target, int index, ArrayList<Integer> list){
        //base case
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        return findPosition(arr, target, index + 1, list);
    }

    public static ArrayList<Integer> findPosition2(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        //base case
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }
        
        ArrayList<Integer> ansFromBelowCalls = findPosition2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,2,3,4,2};
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("The positions of "+target+" is "+findPosition(arr, target, 0, list));
        // System.out.println(findPosition2(arr, target, 0));
    }
}
