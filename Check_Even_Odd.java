//check the number is even or odd input by the user.
import java.util.*;
public class Check_Even_Odd {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=p.nextInt();

        //check the number is even or odd.
        if(number%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
       
        p.close();
    }
}
