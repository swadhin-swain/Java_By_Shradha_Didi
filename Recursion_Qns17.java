//call the guests in pairs or in single

public class Recursion_Qns17 {
    public static int callGuests(int n){
        // base case
        if(n <= 1){
            return 1;
        }

        //call in single
        int singleCall = callGuests(n-1);
        //pair calls
        int pairCalls = (n-1) * callGuests(n-2);

        return singleCall + pairCalls;
    }
    public static void main(String[] args) {
        int n = 4;

        System.out.println("We can call "+n+" guests in "+callGuests(n)+" ways.");
        
    }
}
