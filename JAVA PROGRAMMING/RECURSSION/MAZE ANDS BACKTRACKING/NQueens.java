public class NQueens {
    public static void main(String[] args) {
        boolean[][] board ={{false,false,false,false},
                            {false,false,false,false},
                            {false,false,false,false},
                            {false,false,false,false},};
        System.out.println(nQueens(board,0));
    }
    static int nQueens(boolean[][] board, int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board,r,i)){
                board[r][i]=true;
                count+=nQueens(board,r+1);
                board[r][i]=false;
            }

        }
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] arr : board){
            for(boolean k : arr){
                if (k==true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
    static boolean isSafe(boolean[][] board,int r,int c){
        //checking vertically
        for (int i = 0; i < r; i++) {
            if (board[i][c]==true){
                return false;
            }

        }
        int i=r-1;
        int j=c-1;
        while (j>=0 && i>=0){
            if (board[i][j]==true){
                return false;
            }
            i--;
            j--;
        }
        i=r-1;
        j=c+1;
        while (j<board.length && i>=0){
            if(board[i][j]==true){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
