public class search_in_Range {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Range_search(arr,2,7,8));

    }
    static boolean Range_search(int[] arr,int start, int end,int target){
        if(arr.length==0 && end> arr.length-1){
            return false;
        }
        for (int i = start;i <+ end; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
