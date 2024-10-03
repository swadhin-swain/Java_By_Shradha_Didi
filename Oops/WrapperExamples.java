package Oops;

class A{
    final int a = 10;//always initialized while declaring
    String name;

    public A(String name) {
       // System.out.println("object has been created");
        this.name = name;
    }
@Override
protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    System.out.println("object is destroyed");
}

public class WrapperExamples {
    static void swap(Integer a, Integer b){
        Integer temp=a;
        a= b;
        b=temp;
    }
    public static void main(String[] args) {
        // int a = 10, b=20;

        // Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a+" "+b);

        //final example
        // final int bonus = 2;
        // bonus = 3;//you can not modified

        A kunal = new A("kunal");
        kunal.name="other name";//we can do this

        //when our non primitive is final, you can not reassign it
        //kunal = new A("new object");//we can not do it

        A obj = new A("random name");
        System.out.println(obj);

        // for(int i = 0; i < 1000000000; i++) {
        //     obj = new A("random name");
        // }
    }
}
}
