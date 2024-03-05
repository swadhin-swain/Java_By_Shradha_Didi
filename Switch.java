/*enter 1 for hello
        2 for namaste
        3 for bonjour by switch.   
 */ 
import java.util.*;
public class Switch {
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       //Enter the number.
       System.out.println("Enter the number:"); 
       int number=p.nextInt();

       switch(number){
        case 1:System.out.println("Hello.");
               break;
        case 2:System.out.println("Namaste.");
               break;
        case 3:System.out.println("Bonjour.");
               break;
        default:System.out.println("Enter the valid number.");              
       }
       p.close();
    }
}
