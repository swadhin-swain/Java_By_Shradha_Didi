//Write a Program to print All Armstrong numbers between 1 to 1000
public class Loop_qns5 {
    public static void main(String[] args) {
        int r,sum;
        for(int i=1;i<=1000;i++){
            sum=0;
            int c=i;
            while(c!=0){
               r=c%10;
               sum=(r*r*r)+sum;
               c=c/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
