package Oops.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

   

    public BoxPrice(double length, double height, double width, double weight,double cost){
        super(length,height,width,weight);
        this.cost = cost;
    }
}
    
