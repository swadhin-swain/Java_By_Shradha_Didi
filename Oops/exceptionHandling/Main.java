package Oops.exceptionHandling;

public class Main {
    static int devide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Please do not devide by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            // int c = a/b;
            // devide(a, b);
            throw new Exception("Just for fun");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This is always execute");
        }
    }
}
