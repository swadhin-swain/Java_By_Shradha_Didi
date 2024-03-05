//print the Maximum Subarray Sum
public class Array_Qns9 {
    public static void printMaxSubarraySum(int numbers []){
        int maxSum=Integer.MIN_VALUE;
        int currentSum;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    //sub array sum
                    currentSum += numbers[k];
                }
                //printing the sum of all subArray
                System.out.println(currentSum);
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
           System.out.println();
        }
        //print the maximum sum of subArray
        System.out.println("The maximum subArray sum is "+maxSum);
        System.out.println("The time complexity of this algorithm is O(n3).");
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};

        //call the function
        printMaxSubarraySum(numbers);
    }
}
