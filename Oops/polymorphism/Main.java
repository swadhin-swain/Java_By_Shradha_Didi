package Oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
    }

}
