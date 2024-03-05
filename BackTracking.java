//example of backtracking

public class BackTracking {
    public static void printPermutation(String str, String permutations,int index) {
        if(str.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutations + currChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
