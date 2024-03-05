//print the SUB ARRAY
public class Array_Qns8 {
    public static void printSubArray(int numbers[]){
        int totalSa=0;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print the sub Array
                    System.out.print(numbers[k]+" ");
                }
                totalSa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The number of SUB ARRAY is "+totalSa);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Let's printing the sub Array");
        printSubArray(numbers);
    }
}
