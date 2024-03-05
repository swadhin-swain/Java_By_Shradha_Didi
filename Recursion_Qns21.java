//reverse a number

public class Recursion_Qns21 {
   
    public static void reverseNumber(int number,int sum){
        if(number == 0){
            System.out.println(sum);
            return;
        }
        
        int rem = number % 10;
        sum = sum * 10 + rem;
        reverseNumber(number/10,sum);
    }
    public static void main(String[] args) {
        reverseNumber(12345,0);
       
    }
}
