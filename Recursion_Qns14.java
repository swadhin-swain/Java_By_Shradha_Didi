//print all the permutation of a string and cont thenumber of permmutations

public class Recursion_Qns14 {
    public static int printPermutation(String str, String permutations){
        //base case
        if(str.length() == 0){
            System.out.println(permutations);
            return 1;
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char currentCharacter = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            //now call the recursion for printing and counting
            count +=printPermutation(newString, permutations+currentCharacter);
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ABCD";

        //call the recursion
       int count = printPermutation(str, "");
       System.out.println("The number of permutation is "+count);
    }
}
