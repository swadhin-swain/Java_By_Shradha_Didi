//change the value of array with the help of a function

public class Array_Qns4 {
    public static void changeArray(int marks[]){
        //increse value of each element by one
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};

        System.out.println("Value of array before changing");

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        System.out.println("Value of array after changing");
        
        changeArray(marks);
        
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
