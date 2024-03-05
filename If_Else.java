 //take the input of age from the user and print the person is adult or not.
 import java.util.*;
public class If_Else {
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);

        //take the input of age from the user.
        System.out.println("Enter the person age:");
        int age=p.nextInt();

        //check the person is adult or not.
        if(age>=18){
            System.out.println("The person is adult.");
        }
        else{
            System.out.println("The person is not adult");
        }
       
        p.close();


    }
}
