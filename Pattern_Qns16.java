/*
print the pattern
1111
222
33
4
 */
public class Pattern_Qns16 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
