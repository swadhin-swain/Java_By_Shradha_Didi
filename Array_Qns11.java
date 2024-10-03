//print the maximum SubArray sum by the help of KADANE'S Algorithm

public class Array_Qns11 {
    public static void maxSubArraySumByKadaneAlgo(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int  currSum = 0;

        for(int i=0;i<numbers.length;i++){
            currSum += numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("The maximum sub array sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1};

        maxSubArraySumByKadaneAlgo(numbers);
    }
}
