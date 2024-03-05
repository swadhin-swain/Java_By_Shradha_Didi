//example of set bit
public class BitManipulation2 {
    public static void main(String[] args) {
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;

        int newNumber = bitMask | n;
        System.err.println(newNumber);
    }
}
