import java.util.Arrays;

public class matrixSearchInSortedRC {
    public static void main(String[] args) {
        int[][] mat={ {10,20,30,40},
                      {15,25,35,45},
                      {28,29,37,48},
                      {33,39,43,50} };
        int[] ans= matrixSearch(mat,37);
        System.out.println(Arrays.toString(ans));

    }
    static int [] matrixSearch(int[][] mat, int target){
        int r=0;
        int c=mat.length-1;
        while (r<mat.length && c>=0){
            if (mat[r][c]==target){
                return new int[]{r,c};

            }
            if (target>mat[r][c]){
                r++;

            }else{
                c--;
            }

        }
        return new int[] {-1,-1};
    }
}
