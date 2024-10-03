package Oops.polymorphism;

public class ObjectPrint {

    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override//it can override orginal toString method
    public String toString(){
        return "ObjectPrint{nums"+ num + '}';
    } 
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
