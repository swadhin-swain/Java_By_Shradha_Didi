//print a string in reverse
//ex->"abcd" to "dcba"

public class Recursion_Qns7 {
    public static void printStringInReverse(String str,int n){
        //here n is the index of the  string
        if(n < 0){
            return;
        }
        System.out.print(str.charAt(n));
        printStringInReverse(str,n-1);
    }
    public static void main(String[] args) {
        String str = "ABCD";
        int n = str.length()-1;
        printStringInReverse(str, n);
    }
}
