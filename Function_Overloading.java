public class Function_Overloading {
    //sum of two integer value
    public static int sum(int a,int b){
        return a+b;
    }
    //sum of three integer value 
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    //sum of two floating value
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,8));
        System.out.println(sum(9,23 , 83));
        System.out.println(sum(52.2f, 41.1f));
    }
}
