//print the maximum sum of subArray by the help of a prefix array which is basedon prefix sum

public class Array_Qns10 {
    public static void maxSubArraySumByPrefixArray(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix [] = new int [numbers.length];
        prefix[0]= numbers[0];

        //calclate the prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                //compare the current sum and max sum
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
            }
        }

        System.out.println("The maximum sub array sum is "+maxSum);
        System.out.println("The time complexity is o(n2).");
    }
    public static void main(String[] args) {
        int numbers[] = {1};

        maxSubArraySumByPrefixArray(numbers);
    }
}
