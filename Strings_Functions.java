public class Strings_Functions {
    public static void main(String[] args) {
        //concatenation
        String firstName="swadhin";
        String lastName="swain";
        //let's concatenate the above 2 String
        String fullName=firstName+"@"+lastName;
        System.out.println(fullName);

        //String length
        //fullName=swadhin@swain
        System.out.println("The length of the fullName String is "+fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1="tony5";
        String name2="tony2";
        //let's compare
        //case-1 name1>name2:positive value 
        //case-2 name1<name2: negative value
        //case-3 name1=name2:0
        int c=name1.compareTo(name2);
        System.out.println("Strings compare value is "+c);
        if(name1.compareTo(name2)==0){
          System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // if(name1==name2){
        //     System.out.println("Strings are equal");
        //   }else{
        //       System.out.println("Strings are not equal");
        //   }
        if(new String("tony")==new String("tony")){
            System.out.println("Strings are equal");
          }else{
              System.out.println("Strings are not equal");
          }

          //sub-String
          //it contains begining index and ending index
          //pass ending index+1
          String sentence="my name is swadhin";
          String name=sentence.substring(11,sentence.length());
          System.out.println("The sub-String is "+name);

          //Strings are inmutable.That means if once we can create a string then we cannot modify that String.
          
    }
}
