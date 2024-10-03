package Oops.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
        //this.length = -1;//it is not accessible because length variable in parant class is private
    }

    // @Override
    // static void greetings(){
    //     System.out.println("Hey, I am in BoxWeight class greetings");
    // }

    BoxWeight(double length, double height, double width, double weight){
        super(length,height,width);//what is this  -> call the parent cass constructor
        //used to initialise values present in parent class
       // System.out.println(super.weight);
        this.weight = weight;
    }
}
