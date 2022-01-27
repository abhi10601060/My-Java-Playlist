public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        sudokuSolver(board);

    }
    static void sudokuSolver(int[][] board){
        int[] empty=getEmpty(board);
        int r=empty[0];
        int c=empty[1];

        if(r==-1 && c==-1){
            display(board);
            return;
        }
        for (int i = 1; i < 10; i++) {
            if(isSafe(board,r,c,i)){
                board[r][c]=i;
                sudokuSolver(board);
                board[r][c]=0;
            }
        }
        return;


    }
    static int[] getEmpty(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                if(board[i][j]==0){
                    return new int[] {i,j};
                }
            }
        }
        return new  int[] {-1,-1};
    }
    static boolean isSafe(int[][] board,int r,int c,int n){
        for (int i = 0; i < board.length; i++) {
            if(board[i][c]==n){
                return false;
            }

        }
        for (int i = 0; i < board.length; i++) {
            if(board[r][i]==n){
                return false;
            }
        }
        for (int i = r-r%3; i <r-r%3+3 ; i++) {
            for (int j = c-c%3; j <c-c%3+3 ; j++) {
                if(board[i][j]==n){
                    return false;
                }

            }
        }
        return true;
    }
    static void display(int[][] board){
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
