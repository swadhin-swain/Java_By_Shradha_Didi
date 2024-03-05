//print the table of a number input by the user.
import java.util.*;
public class Loop_Qns2 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=p.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        p.close();
    }
}
