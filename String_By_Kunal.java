public class String_By_Kunal {
    public static void main(String[] args) {
        String name = "swadhin swain";
        System.out.println(name);

        String a = "swadhin";
        System.out.println(a);
        String b= "swadhin";
        //compare the two string are pointing on same object or not
       System.out.println(a==b);
       String name1= new String("swadhin");
       String name2= new String("swadhin");
       //check the above 2 strings are pointing to same object or not
       System.out.println(name1==name2);

       String name3=name1;
       //check the name3 and name1 are pointing to same object or not
       System.out.println(name1==name3);
       
       System.out.println(name1.equals(name2));//it checks the value of the object and return true if the value is same either it pointing to different objects
       System.out.println(name1.charAt(0));
       
       //if we cannot initialize any value to the string then it can print nul
       String nama=null;
       System.out.println(nama);
       // String b = "swadhin";

       //printing the limit of decimal value you want
       float f = 453.1273f;
       System.out.printf("formatted is %.2f",f);
       String series = "";
       for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        series+=ch;
        System.out.print(ch+" ");
    }
    System.out.println(series);

    //creating string builder
    StringBuilder biulder = new StringBuilder();
    for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        biulder.append(ch);
    }
    System.out.println(biulder);
    biulder.reverse();
    System.out.println(biulder);
    }

}
