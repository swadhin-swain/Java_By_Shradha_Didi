/*
print the pattern
   *
  **
 ***
****
 */
public class Pattern_Qns5 {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop->space printing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //another inner loop->star printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
