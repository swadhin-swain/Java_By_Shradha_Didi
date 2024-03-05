//Make a function to print the table of a given number n.
import java.util.*;
public class Function7 {
    public static void printTable(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        //entre the number 
        System.out.println("Enter the number for printing the table:");
        int a=p.nextInt();
        printTable(a);
        
        p.close();
    }
}
