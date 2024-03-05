public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("swadhin");
        System.out.println(sb);

        //print the char at index 0;
        System.out.println("Print the first index of string builder");
        System.out.println(sb.charAt(0));

        //set char at index
        System.out.println("set the first inex of the string builder with 'p' ");
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert the element
        System.out.println("enter the alphabet 'a' at the last of the string builder ");
        sb.insert(7, 'a');
        System.out.println(sb);

        //delete the extra 'a' at the last
        System.out.println("delete 'a' from last");
        //sb.deleteCharAt(7);
        //or
        sb.delete(7,8);
        System.out.println(sb);

        //append function
        StringBuilder sb1=new StringBuilder("h");
        sb1.append("e");//str= str+ "e" //in case of string
        sb1.append("l");//str= str+ "l"
        sb1.append("l");//str= str+ "l"
        sb1.append("o");//str= str+ "o"
        System.out.println(sb1);

        //length
        System.out.println("The length of the sb1 is "+sb1.length());
    }
}
