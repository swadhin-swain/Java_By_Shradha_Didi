package Oops;

class Student{
    int rollno;
    String name;
    float marks=90.8f;

    //wew need a way to add the values of the above properties object by object
    //we need one word to access every object
    void greeting() {
        System.out.println("helo my name is "+this.name);
    }

    void chageName(String name) {
        this.name= name;
    }

    Student(Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
    
    Student() {
        //this is how you call a constructor from another constructor
        //internally: new Student(13,"default person",100.0)
        this(13,"default person",100.0f);
    }

    //Student arpit = new Student(17,"arpit",98.9f);
    //here this will be replaced with arpit 
    Student(int rollno, String name, float marks) {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}
public class Class{
    public static void main(String[] args) {
        Student swadhin = new Student(13,"pinu",89.0f);
        Student rahul = new Student(33,"rahul",99.9f);
        System.out.println(rahul.marks);

        // swadhin.rollno=10;
        // swadhin.name="swadhin swain";
        // swadhin.marks=67.98f;

        // System.out.println(swadhin.rollno);
        // System.out.println(swadhin.name);
        // System.out.println(swadhin.marks);
    //     swadhin.chageName("Animal lover");
    //     swadhin.greeting();

    Student random = new Student(swadhin);
    System.out.println(random.name);

    Student random2 = new Student();
    System.out.println(random2.name);

    Student one = new Student();
    Student two = one;

    one.name = "something";
    System.out.println(two.name);//ans = something
    }
}