//Write a Program to print All perfect numbers 1 to 10000.
public class Loop_Qns4 {
    public static void main(String[] args) {
        //print the all perfect number
        int sum;
        for(int i=1;i<=10000;i++){
           sum=0;
           for(int j=1;j<i;j++){
            if(i%j==0){
                sum+=j;
            }
           }
           if(sum==i){
            System.out.println(i);
           }
        }
    }
}
