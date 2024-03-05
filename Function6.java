//Make a function to check if a given number n is even or not.
import java.util.*;
public class Function6 {
    public static void checkEvenNumber(int x){
        if(x%2==0){
            System.out.println(x+" is even.");
        }else{
            System.out.println(x+" is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //entre the number 
        System.out.println("Enter the number for checking:");
        int a=p.nextInt();
        checkEvenNumber(a);
        p.close();
    }
}
