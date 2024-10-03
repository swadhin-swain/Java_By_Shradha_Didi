class a{
    public static void m1(){
        System.out.println("class a method");
    }
}

class b extends a {
    public static void m1(){
        System.out.println("class b methos");
    }
}
public class Practice {
   public static void main(String[] args) {
    a bb = new b();
    bb.m1();
   }
}