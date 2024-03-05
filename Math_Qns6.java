//find the prime number in the range by the help of the sieve of eratosthenese

public class Math_Qns6 {
    public static void primesBySOE(boolean arr[], int n){
        //
        for(int i = 2;i<=Math.sqrt(n);i++){
            //all the value in array is initially false
            if(!arr[i]){
                for(int j = i * 2;j <= n;j += i){
                    arr[j] = true;
                }
            }
        }

        //print the prime numbers
        //false in array means numbewr is prime
        for(int i = 2;i<=n;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 50;
        boolean arr[] = new boolean[n+1];

        primesBySOE(arr, n);
       
    }
}
