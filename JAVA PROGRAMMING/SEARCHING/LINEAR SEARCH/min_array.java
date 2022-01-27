public class min_array {
    public static void main(String[] args) {
        int[] arr={185,965,46,2456,6011,453,12,};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        if(arr.length==0){
            return -1 ;
        }
        int ans= arr[0];
        for( int num : arr){
            ans=Math.min(ans,num);
        }
        return ans;
    }
}
