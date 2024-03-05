//printing the minimum subArray sum
public class Array_Qns12 {

    public static void minSubArraySum(int numbers[]){
        int currentSum;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=numbers[k];
                }
                //printing the current sum of all sub array
                System.out.print(currentSum);
                if(minSum>currentSum){
                    minSum=currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The minimum subArray sum is "+minSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-2,3};

        minSubArraySum(numbers);
    }
}
