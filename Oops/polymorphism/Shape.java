package Oops.polymorphism;

public class Shape {
    void area() {
        System.out.println("I am shapes");
    }

    //early binding
    //used to prevent overriding
    // final void area() {
    //     System.out.println("I am shapes");
    // }
}
