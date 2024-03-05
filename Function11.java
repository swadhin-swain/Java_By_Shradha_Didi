//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
public class Function11 {
    public static void countPostiveNegativeZero(){
        Scanner p= new Scanner(System.in);
        int countPositive=0;
        int countNegative=0;
        int countZero=0;
        char ch;
        //enter the number until you want.
        do{
            System.out.println("Enter number:");
            int a=p.nextInt();

            //count the positive,negative and zero.
            if(a>0){
                countPositive++;
            }else if(a<0){
                countNegative++;
            }else{
                countZero++;
            }

            System.out.println("Enter 'y' if you want to enter number:");
            ch=p.next().charAt(0);
        }while(ch=='y' ||ch=='Y');

        //print the counts positive,negative and zero.
        System.out.println("The counts of positive is "+countPositive);
        System.out.println("The counts of negative is "+countNegative);
        System.out.println("The counts of zero is "+countZero); 
        p.close();
    }
    public static void main(String[] args) {
        countPostiveNegativeZero();
    }
}
