//flipping the image

public class Math_Qns5 {
    public static void main(String[] args) {
        int arr[][] = {{1,1,0},
                       {1,0,1},
                       {0,0,0}};
        
        for(int[] row : arr){
            //reverse this array
            int n = arr[0].length;
            for(int i =0;i<= n/2;i++){
                //swap 
                int fv = row[i] ^ 1;
                int sv = row[n-i-1] ^ 1;
                row[i] = sv;
                row[n-i-1] = fv;

            }
        }   
        for(int i = 0 ;i <arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }            
    }
}
