//count the number of steps

public class Recursion_Qns23 {
    public static int numberOfSteps(int number, int steps){
        if(number == 0){
            return steps;
        }

        //if the number is even
        if(number % 2 == 0){
            return numberOfSteps(number/2, steps+1);
        }

        return numberOfSteps(number-1, steps+1);
    }
    public static void main(String[] args) {
        int number = 15;
        System.out.println(numberOfSteps(number, 0));
    }
}
