//find the smallest letter greater than the target
public class Binary_Search_Qns4 {
    public static char nextGreatestletter(char arr[], char target){
        int start=0,end=arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    } 
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d','e'};
        char target = 'b';

        System.out.println(nextGreatestletter(arr, target));
    }
}
