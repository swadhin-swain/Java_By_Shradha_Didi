import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(10);
        Scanner p= new Scanner(System.in);
        
        // list.add(55);
        // list.add(65);
        // list.add(75);
        // list.add(85);
        // list.add(95);
        // list.add(15);
        // list.add(25);
        // list.add(35);

        // System.out.println(list.contains(65));
        
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        //input
        System.out.println("ENTER THE ARRAYLIST");
        for(int i = 0;i < 5;i++){
            list.add(p.nextInt());
        }

        //get the item at any index
        for(int i = 0;i < 5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
        p.close();
    }
}
