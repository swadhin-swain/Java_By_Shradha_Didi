//print all the sub-sequences of a string

public class Recursion_Qns12 {
    public static void printSubSequences(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);
        
        //if current character want to add with subsequences
        printSubSequences(str, index+1, newString + currentChar);

        //if current character not want to add with subsequences
        printSubSequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str = "ABCD";
        String newString = "";

        printSubSequences(str, 0, newString);
    }
}
