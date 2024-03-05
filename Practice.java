public class Practice {
    public static int nQueen(boolean[][] board,int row) {
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=nQueen(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static boolean isSafe(boolean[][] board,int row,int col) {
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int leftmax=Math.min(row,col);
        for(int i=1;i<=leftmax;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int rightmax=Math.min(row,board[0].length-col-1);
        for(int i=1;i<=rightmax;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }
}