public class SortedOrnot {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9,7,4};

        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr , int idx){
        if (idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return helper(arr,idx+1);
    }
}
