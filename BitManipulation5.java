//find the only non repeating element in an array where every element repeat twice
public class BitManipulation5 {
    public static void main(String[] args) {
        int arr [] = {5,4,1,4,3,5,1};
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result ^= arr[i];
        } 

        System.out.println(result);
    }
}
