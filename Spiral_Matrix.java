//print the spiral matrix

public class Spiral_Matrix {
    public static void spiralMatrix(int[][] arr) {
        int rowBegin = 0;
        int rowEnd = arr.length-1;
        int colBegin = 0;
        int colEnd = arr[0].length-1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            //traverse right
            for(int i = colBegin ;i<= colEnd;i++){
                System.out.print(arr[rowBegin][i]+" ");
            }
            rowBegin++;

            //traverse down
            for(int i = rowBegin ;i<= rowEnd;i++){
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd--;

            //traverse left
            if(rowBegin <= rowEnd)
            for(int i = colEnd ;i>= colBegin;i--){
                System.out.print(arr[rowEnd][i]+" ");
            }
            rowEnd--;

            //traverse up
            if(colBegin <= colEnd)
            for(int i = rowEnd ;i>= rowBegin;i--){
                System.out.print(arr[i][colBegin]+" ");
            }
            colBegin++;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25},
                       {26,27,28,29,30}};

        spiralMatrix(arr);
    }
}
