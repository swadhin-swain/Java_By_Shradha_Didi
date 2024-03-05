//find the gcd by the help of the euclideian method
public class MathematicsForCp {
    static int gcd(int a, int b){
        if( b== 0){
            return a;
        }
        return gcd(b , a%b);
    }
    public static void main(String[] args) {
        System.out.println("The gcd of 60 and 24 is "+gcd(60,24));
    }
}
