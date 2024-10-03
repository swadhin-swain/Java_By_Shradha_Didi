package Oops.access;

public class ObjectDemo {
    int num;
    float gpa;
    
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals( Object obj) {
       
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(34, 78.9f);

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

        // System.out.println(obj1.hashCode());
        // System.out.println(obj2.hashCode());
    }
}
