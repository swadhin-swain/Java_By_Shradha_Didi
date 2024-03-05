//example of the update bit
import java.util.*;

public class BitManipulation4 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = 5;
        int position = 1;
        // operation = 0 -> set , operation = 1 ->clear
        System.out.println("Enter the operation:");
        int operation = p.nextInt(); //update bot to 1 else update bit to zero

        int bitMask = 1<<position;
        int newNumber;
        if(operation == 1){
            //set
            newNumber = bitMask | n;
        } else {
            //clear
            bitMask = ~(bitMask);
            newNumber = bitMask & n;
        }
        System.out.println(newNumber);
        p.close();;
    }
}
