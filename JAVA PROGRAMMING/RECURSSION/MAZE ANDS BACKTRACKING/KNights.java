public class KNights {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];

        System.out.println(nKnights(board,0,0,4));

    }
    static  int nKnights(boolean[][] board,int r,int c,int k){
        if(k==0){
            display(board);
            System.out.println();
            return 1;
        }
        if (r>=board.length-1 && c==board.length){
            return 0;
        }

        int count=0;

        if (c==board.length){
            count+=nKnights(board,r+1,0,k);
            return count;
        }

        if(isSafe(board,r,c)){
            board[r][c]=true;
            count+=nKnights(board,r,c+1,k-1);
            board[r][c]=false;
        }
        count+=nKnights(board,r,c+1,k);
        return count;
    }
    static void display(boolean[][] board){
        for (boolean[] arr : board){
            for(boolean k : arr){
                if (k==true){
                    System.out.print("K ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board,int r,int c){
        if(r>1 && c>0){
            if(board[r-2][c-1]==true ){
                return false;
            }
        }
        if(r>1 && c<board.length-1 ){
            if(board[r-2][c+1]==true){
                return false;
            }
        }
        if (c>1 && r>0){
            if(board[r-1][c-2]==true){
                return false;
            }
        }
        if (c<board.length-2 && r>0){
            if (board[r-1][c+2]){
                return false;
            }
        }
        return true;
    }

}
