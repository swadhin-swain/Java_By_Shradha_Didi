//find the maximum wealth of a person among several accounts

public class Array_Qns21 {
    public static int maximumWealth(int accounts[][]){
     int ans = Integer.MIN_VALUE;

     for(int i = 0;i<accounts.length;i++){
        int sum = 0;
        for(int j=0;j<accounts[i].length;j++){
            sum += accounts[i][j]; 
        }
        //now we have sum of accounts of person
        //check with overall ans
        if(sum > ans){
            ans = sum;
        }
     }
     return ans;
    }
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},
                            {4,1,6},
                            {3,3,7}};

        System.out.println("The maximum wealth is "+maximumWealth(accounts));                    
    }
}
