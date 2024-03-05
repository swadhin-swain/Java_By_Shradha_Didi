//print a given name by the help of a function.
import java.util.*;
public class Functio {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in);
       System.out.println("Enter the name:");
       String name=p.nextLine();
       printMyName(name);//function call
       p.close(); 
    }
}
