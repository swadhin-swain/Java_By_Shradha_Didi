//search the even number element in an array
public class Array_Qns20 {
    static int findNumbers(int arr[]){
        int count = 0;
        for(int element : arr){
            if(even(element)){
                count++;
            }
        }
        return count;
    }
    //function for check the number in an array is even or not
    static boolean even(int element){
        int count=0;
        while(element > 0){
         element = element/10;
         count++;
        }

        if(count % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,2313,395,2,6,4565};
        System.out.println("The number of even digit element in the array is "+findNumbers(arr));
    }
}
