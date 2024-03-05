/*
print the pattern
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
(Floyd's triangle)
 */
public class Pattern_Qns8 {
    public static void main(String[] args) {
        int n=5,number=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                number++;
              System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}