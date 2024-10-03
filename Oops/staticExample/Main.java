package Oops.staticExample;

public class Main {

    //wethat is which is non-static, belongs to an object
    void greeting(){
        System.out.println("hello world");
        //fun();//you can access an static methiod inside an non static method
    }

    //this is not dependent on object because it is static
    static void fun(){
        //greeting();

        //you cannot access the non static sttuff without referencing their instances in a static context

        //hence, here i am referencing it
        Main obj = new Main();
        obj.greeting();
        
    }

    void fun2() {
         greeting();//you can call a non static method inside an non static method
    }
    public static void main(String[] args) {
        //example of static varriable

        // Human swadhin = new Human(22, "swadhin swain", 15000, false);

        // Human rahul = new Human(22, "Rahul jena", 10000, false);

        // Human sahul = new Human(22, "sahul jena", 10000, false);

        // System.out.println(swadhin.name);
        // System.out.println(rahul.name);

        // System.out.println(Human.population);
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
        fun();
    }
}
