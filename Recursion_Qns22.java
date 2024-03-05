//count the zeros in a number

public class Recursion_Qns22 {
    public static void countZeros(int number,int count){
        if(number == 0){
            System.out.println(count);
            return ;
        }

        int rem = number % 10;
        if(rem == 0){
            count++;
        }
        countZeros(number/10, count);
        
    }
    public static void main(String[] args) {
        int number = 1020303;
        countZeros(number, 0);
       
    }
}
