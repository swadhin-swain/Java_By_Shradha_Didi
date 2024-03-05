//remove all the duplicate character from the string

public class Recursion_Qns11 {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currentChar = str.charAt(index);

        if(map[currentChar - 'a'] == true){
            removeDuplicates(str, index+1, newString);
        } else {
            newString += currentChar;
            map[currentChar -'a'] = true;
            removeDuplicates(str, index+1, newString);
            
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        String newString = "";

        removeDuplicates(str, 0, newString);
    }
    
}
