//move all the x to the end of the string

public class Recursion_Qns10 {
    public static void moveAllX(String str, int index,int count, char target, String newString){
        if(index == str.length()){
            // add the x using for loop 
            for(int i=0;i<count;i++){
                newString += target;
            }
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if(currentChar == target){
            count++;
            moveAllX(str, index+1,count, target,newString);
        } else {
            newString += currentChar;
            moveAllX(str, index+1,count, target,newString);

        }
       
        
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        char target = 'x';
        String newString = "";

        moveAllX(str, 0, 0, target, newString);
    }
}
