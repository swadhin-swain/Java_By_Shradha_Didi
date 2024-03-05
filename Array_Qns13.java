//printing the minimum subArray sum by the help of prefix array
public class Array_Qns13 {

    public static void minSubArraySumByPrefixArray(int numbers[]){
        int prefix[]=new int [numbers.length];
        prefix[0]=numbers[0];
        
        //calculate the prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] =prefix[i-1]+ numbers[i];
        }
        int currentSum=0;
        int minSum=Integer.MAX_VALUE;

       for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            currentSum = start ==0 ? prefix[end]:prefix[end]-prefix[start-1];
            if(minSum>currentSum){
                minSum=currentSum;
            }
        }
        
       }
       System.out.println("The minimum subArray sum is "+minSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};

        minSubArraySumByPrefixArray(numbers);
    }
    
}
