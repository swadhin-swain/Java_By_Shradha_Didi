//find the first and last occurance of an element in a string
//"abaacdaefaah".target = 'a'. first occurance at index 0 and last occurance at index 10

public class Recursion_Qns8 {
    public static int first = -1;
    public static int last = -1;
    //recursive function
    public static void findOccurance(String str,int index,char target){
        if(index == str.length()){
            System.out.println("First occurance of "+target+" is "+first);
            System.out.println("Last occurance of "+target+" is "+last);
            return;
        }

        char ch = str.charAt(index);
        //check the occurance
        if(ch == target){
            if(first == -1){
                first = index;
            } else {
                last = index; 
            }
        }
        findOccurance(str, index+1, target);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char target = 'a';

        findOccurance(str, 0, target);
    }
}
