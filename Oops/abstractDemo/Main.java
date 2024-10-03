package Oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
    
        Parent daughter = new Daughter(28);
        daughter.career();

       // Parent parent = new partner(45);
       Parent.hello();
       son.normal();
       
        
       
    }
}
