package Oops.abstractDemo;

public class Son extends Parent{

    public Son (int age) {
        super(age);
        
    }
    
    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void normal() {
        
        super.normal();
    }

    @Override
    void partner() {
     System.out.println("I love Wonder woman");
    }
    
}
