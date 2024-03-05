//example of recursion
public class Recursion {
    //base case
    public static void printNumbers(int n){
        if(n == 0){
           return;
        }
        //printing
        System.out.println(n);

        //recursion
        printNumbers(n-1);
    }

    //another ex-> print 1 to 5
   
        //base case
        public static void printNumber(int n){
            if(n == 6){
               return;
            }
            //printing
            System.out.println(n);
    
            //recursion
            printNumber(n+1);
        }
        //print in another way
        public static void print(int n){
            if(n==0){
                return;
            }

            print(n-1);
            System.out.println(n);

        }
    public static void main(String[] args) {
       int n = 5;

       //call the recursion function
       printNumbers(n);

       //printing for 1 to 5
       int m = 1;
       printNumber(m);

       print(n);
    }
}
