//multi dimentional arraylist
import java.util.*;

public class MultiDimentioinalArrayList {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //add elements
        for(int i=0; i< 3 ;i++){
            for(int j=0; j< 3 ;j++){
                list.get(i).add(p.nextInt());
            }
        }

        //print the arraylist
        System.out.println(list);
        p.close();
    }
}
