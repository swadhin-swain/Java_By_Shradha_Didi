/*
 Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.

 */
import java.util.*;
public class Conditional_Statement_HW {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
    //take input the value of a & b from the user.
    System.out.println("Enter the value of a:");
    int a=p.nextInt();
    System.out.println("Enter the value of b:");
    int b=p.nextInt();

    //take the input of operation from the user.
    System.out.println("Enter the operation:");
    char ch=p.next().charAt(0);

    //check the operator and do the operation.
    if(ch=='+'){
        System.out.println("The addition of a & b is "+(a+b));
    }
    else if(ch=='-'){
        System.out.println("The substraction of a & b is "+(a-b));
    }
    else if(ch=='*'){
        System.out.println("The multiplication of a & b is "+(a*b));
    }
    else if(ch=='/'){
        System.out.println("The division of a & b is "+(a/b));
    }
    else if(ch=='%'){
        System.out.println("The remainder of a & b is "+(a%b));
    }
    else{
        System.out.println("Enter the valid operation.");
    }
    p.close();

    }
}
