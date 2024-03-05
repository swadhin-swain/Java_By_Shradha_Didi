//combination of dice

public class Recursion_Qns31 {
    public static void diceCombination(String sides, int target){
        if(target == 0) {
            System.out.println(sides);
            return;
        }

        for(int i =1;i<=6 && i<= target;i++) {
            diceCombination(sides+i, target-i);
        }
    }
    public static void main(String[] args) {
        diceCombination("", 4);
    }
}
