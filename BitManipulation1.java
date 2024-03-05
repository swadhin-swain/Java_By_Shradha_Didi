//get bit example
public class BitManipulation1 {
    public static void main(String[] args) {
        int n = 5;
        int position = 3;
        int bitMask = 1<<position;

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
