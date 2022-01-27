import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] mat={ {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16} };
        int[] ans=matrixSearch(mat,11);
        System.out.println(Arrays.toString(ans));

    }
    static int[] matrixSearch(int[][] mat,int target){
        int r=getColumnCeiling(mat,target);
        if (r==-1){
            return new int[]{-1,-1};
        }
        int c=binarySearch(mat[r],target);
        if (c==-1){
            return new int[] {-1,-1};
        }
        return new int[] {r,c};

    }
    static int getColumnCeiling(int[][] mat ,int target){
        int s=0;
        int e=mat.length-1;

        while (s<e){
            int mid = s+(e-s)/2;

            if (mat[mid][mat[0].length-1]==target){
                return mid;

            }
            if (target>mat[mid][mat[0].length-1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if (s==mat.length){
            return -1;
        }
        return s;
    }
    static int binarySearch(int[] arr,int  target){
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (target>arr[mid]){
                s=mid+1;

            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
}
