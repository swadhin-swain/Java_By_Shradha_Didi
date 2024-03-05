//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class Function {
    public static double calculateCircumference(float r) {
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
     Scanner p=new Scanner(System.in);
     //input the radius
     System.out.println("Enter the value of radius:");
     float r=p.nextFloat(); 
     System.out.println("The circumference of the circle is "+calculateCircumference(r));  
     p.close();
    }
}
