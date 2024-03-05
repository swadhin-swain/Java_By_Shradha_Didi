//find an element in an  array

public class Recursion_Qns24 {
    public static int findElement(int arr[], int target,int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        
        return findElement(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,18,9};
        int target = 18;

        System.out.println("The index of "+target+" is "+findElement(arr, target, 0));
    }
}
