//compare a and b which is greater or equal.
import java.util.*;
public class Compare_a_And_b {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //input a and b.
        System.out.println("Enter the value of a:");
        int a=p.nextInt();

        System.out.println("Enter the value of b:");
        int b=p.nextInt();

        //check which is greater or equal.
        if(a==b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("A is greater.");
            }
            else{
                System.out.println("B is greater.");
            }

            p.close();
        }
    }
}
