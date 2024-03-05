import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //String declaration
        // String name="swadhin";
        // String fullName="swadhin swain";
        // String sentance="My name is swadhin";

        //input the String from the user
        Scanner p=new Scanner(System.in);
        // System.out.println("Enter the String:");
        // String name=p.next();
        // System.out.println("Your name is "+name);
        
        //input the full name
        System.out.println("Enter your name:");
        String fullName=p.nextLine();
        System.out.println("Your name is "+fullName);
        p.close();
    }
}
