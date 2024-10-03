class Shape{
    String color;
    public void area() {
        System.out.println("displas area");
    }
}
//single inheritance
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//multi level inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//hierarchical inheritance
class Circle extends Shape {
    public void area(int r){
         System.out.println((3.14)*r*r);
    }
}

public class INHERITANCE {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
