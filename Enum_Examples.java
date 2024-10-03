public class Enum_Examples {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //these are enum constants
        // p[ublic, static, final
        // since it final you cannot create child enums
        // typr is week
        Week() {
            System.out.println("constructor called for "+ this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // because this is not ther enum concept

    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        // System.out.println(week);


        // for(Week day :Week.values() ){
        //     System.out.println(day);
        // }
        
        // System.out.println(week.ordinal());//ordinal means the position

       

    }
}
