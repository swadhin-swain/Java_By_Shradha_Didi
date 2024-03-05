//remove the target character from the string

public class Recursion_Qns28 {
    public static void removeTarget(String str,int index, char target, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar == target) {
            removeTarget(str, index+1, target, newString);
        } else {
            removeTarget(str, index+1, target, newString+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "baccad";
        char target = 'a';

        removeTarget(str, 0, target, "");
    }
}
