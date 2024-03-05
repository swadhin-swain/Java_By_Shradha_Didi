/*enter 1 for hello
        2 for namaste
        3 for bonjour by Else if.   
 */ 
import java.util.*;
public class If_else_Qns2 {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //Enter the number.
        System.out.println("Enter the number:"); 
        int number=p.nextInt();

        if(number==1){
            System.out.println("Hello.");
        }else if(number==2){
            System.out.println("Namaste.");
        }else if(number==3){
            System.out.println("Bonjour.");
        }
        else{
            System.out.println("Invalid number.");
        }
        
        p.close();
 
    }
}
