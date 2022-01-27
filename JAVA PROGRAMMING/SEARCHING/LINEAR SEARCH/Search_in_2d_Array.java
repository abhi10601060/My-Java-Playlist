import java.util.Arrays;

public class Search_in_2d_Array {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};

//        System.out.println(Search_2d(arr, 9));
        int[] ans = get_index(arr,7);
        System.out.println(Arrays.toString(ans));


    }

    static boolean Search_2d(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int[] row : arr) {
            for (int col : row) {
                if (col == target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] get_index(int[][] arr, int target) {
        int[] ans = {-1, -1};
        if (arr.length == 0) {
            return ans;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    ans[0]=row;
                    ans[1]=col;
                    return ans;

                }
            }
        }
        return ans;
    }
}
