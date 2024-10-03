class Pen{
    String color;
    String type;//ballpen, gelpen

    public void write() {
        System.out.println("Writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(String name){
         System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name+" "+age);
    }
   
}
public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "gel";

        // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.color="black";
        // pen2.printColor();


        Student s1 = new Student();
    
        s1.name="swadhin";
        s1.age=22;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);

    }
}
