package Oops.inheritance;

public  class Box {
   private double length;
    double height;
    double width;
//    double weight;

    static void greetings(){
        System.out.println("Hey, I am in Box class greetings");
    }
    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    //cube
    Box(double side) {
        //super(); object class
        this.length = side;
        this.height = side;
        this.width = side; 
    }

    Box(double length,double height, double width) {
        System.out.println("Box class constructor");
        this.length = length;
        this.height = height;
        this.width = width; 
    }

    Box(Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
