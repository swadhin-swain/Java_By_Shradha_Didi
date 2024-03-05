//place the tiles in a floor

public class Recursion_Qns16 {
    public static int placeTiles(int n, int m){
        //base case 1
        if(n == m){
            return 2;
        }
        //base case 2
        if(n < m){
            return 1;
        }

        //if we can place tiles vertically
        int verticalPlaces = placeTiles(n-m, m);

        //if we can place tiles horrizontally
        int horrizontalPlaces = placeTiles(n-1, m);

        return verticalPlaces + horrizontalPlaces;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        System.out.println("The number of placements are "+placeTiles(n, m));
        
    }
}
