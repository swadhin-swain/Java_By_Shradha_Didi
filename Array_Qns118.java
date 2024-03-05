//search the character in the array.
//if the character is present then print true else print false

import java.util.Arrays;

public class Array_Qns118 {
    public static boolean search(String name , char target){
        if(name.length() == 0){
            return false;
        }
        // for(int i = 0;i<name.length();i++){
        //     if(target == name.charAt(i)) {
        //         return true;
        //     }
        // }

        for(char ch :name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "swadhin";
        char target = 'a';
        //for printing true or false according to the target is present or not
        System.out.println(search(name, target));
        //for printing the string array to single character
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
