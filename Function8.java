//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class Function8 {
    public static void average(float x,float y,float z){
        float avg=(x+y+z)/3;
        System.out.println("The average of "+x+","+y+","+z+" is "+avg);
    }
    public static void main(String[] args) {
       Scanner p=new Scanner(System.in); 
       System.out.println("Enter the value of first number:");
       float a=p.nextFloat();
       System.out.println("Enter the value of second number:");
       float b=p.nextFloat();
       System.out.println("Enter the value of third number:");
       float c=p.nextFloat();
       average(a, b, c);
       p.close();
    }
}
