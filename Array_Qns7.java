//print the pairs in an array
public class Array_Qns7 {
    public static void printPairs(int numbers[]){
        int totalPairs=0;

        for(int i=0;i<numbers.length-1;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print(" ( "+current+" , "+numbers[j]+" )");
                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("Total pairs = "+totalPairs);
         
        //formula
        //total pairs = n(n-1)/2
    }
    public static void main(String[] args) {
       int numbers[] = {2,4,6,8,10}; 

       printPairs(numbers);
    }
}
