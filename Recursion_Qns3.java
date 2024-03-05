//print fibonacci series by the help of recurrence

public class Recursion_Qns3 {
   public static int fobonacci(int n){
    if(n <= 1){
        return n;
    }

    return fobonacci(n-1)+fobonacci(n-2);
   }
    public static void main(String[] args) {
        int n = 10;

        for(int i = 0;i< n;i++){
            System.out.print(fobonacci(i)+" ");
        }
    }
}
