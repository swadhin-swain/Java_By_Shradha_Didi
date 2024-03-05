//example of clear bit
public class BitManipulation3 {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int notBitmask = ~(bitMask);

        int newNumber = notBitmask & n;
        System.out.println(newNumber);
    }
}
