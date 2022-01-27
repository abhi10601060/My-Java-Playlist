public class Binary_search {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int ans=Binary_Search(arr,99);
        System.out.println(ans);

    }
    static int Binary_Search(int[] arr , int target){
        if (arr.length==0){
            return -1;
        }
        int s =0;
        int e= arr.length-1;


        while (s<=e) {
            int mid =  s+(e-s)/2;

            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;

    }
}
