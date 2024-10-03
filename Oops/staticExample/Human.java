package Oops.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    
    static long population;

    static void messege(){
        System.out.println("hello word");
        //you can not access this keyword inside the object
        //System.out.println(This.age);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population +=1;

    }
}
