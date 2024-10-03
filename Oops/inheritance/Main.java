package Oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,5,6);
        // System.out.println(box.height+" "+box.width);

         Box box2 = new Box(box);
       

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,5);
        // System.out.println(box3.weight+" "+box3.length);//the length in parent class is private

        // Box box5 = new BoxWeight(2,3,4,8);
        // System.out.println(box5.width);
        //System.out.println(box5.weight);//this gives error

        // thare are many variables in both child and parent classes
        // you are given access to variable that are in the reference type i.e. is BoxWeight
        //hence you should have access the weight variable
        //this also means, that the ones you are trying to access should be initialised
        // but here, when the object is in the parent class how you will call the constructor of child class
        // that is why error
        
        //BoxWeight box6 = new Box(2,3,4);//this is not applicable

        //BoxPrice box = new BoxPrice();

        box.greetings();


        Box box1 = new BoxWeight();
        box1.greetings(); // you can inherit but yuo cannot override
    }
}