//linear search
public class Array_Qns5 {
    public static int linearSearch(String menu[],String key){

        for(int i=0;i<menu.length;i++){
           if(menu[i]==key){
            return i;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"Dosa","Samosa","Alu paratha","Noodles","Frooty"};
        String key="maggie";
         
       int index=linearSearch(menu, key);
       if(index==-1){
        System.out.println("NOT FOUND");
       } else{
        System.out.println("Key is at index "+index);
       }
    }  
}
