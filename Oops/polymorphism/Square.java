package Oops.polymorphism;

public class Square extends Shape {

    //this will run when obj of circle is created
    //hence it is overriding the parent classes
    @Override // this is called annotation
    void area() {
        System.out.println("Area is square of side");
    }
}
