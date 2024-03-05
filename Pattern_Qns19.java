/*
print the pattern
    1
   212
  32123
 4321234
543212345
 */
public class Pattern_Qns19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half
            // for(int j=1;j<=i-1;j++){
            //     System.out.print(j+1);
            // }
            //or
            for(int j=2;j<=i;j++){
                System.out.print(j);
                 }
            
            System.out.println();
        }
    }
}
