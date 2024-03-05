import java.util.*;
public class Hello{
    public static void main(String args[]){
         System.out.print("Hello World!\n");
         System.out.print("Hello World!\n");
         System.out.print("Hello World!\n");

         System.out.print("Hello World!\nby swadhin\n");
         System.out.print("*\n**\n***\n****\n");
         Scanner p=new Scanner(System.in);
         System.out.println("Enter your name:");
         String name=p.nextLine();
         System.out.println(name);
        System.out.println("Enter the value of a:");
        int a=p.nextInt();
        System.out.println("Enter the value of b:");
        int b=p.nextInt();
        int sum=a+b;
        System.out.println("the sum is "+sum);
        p.close();
    }
}