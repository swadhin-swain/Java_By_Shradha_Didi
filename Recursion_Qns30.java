
//return all the permutation of the string in an arrayList.
import java.util.ArrayList;

public class Recursion_Qns30 {
    public static ArrayList<String> stringPermutations(String str, String permutations) {
        ArrayList<String> list = new ArrayList<>();
        if (str.length() == 0) {
            list.add(permutations);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            ans.addAll(stringPermutations(newString, permutations + currChar));
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "ABCD";

        System.out.println(stringPermutations(str, ""));
    }
}
