public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int[] arr1 ={9,8,7,6,5,4,3,2,1};
        int ans=Order_Agnostic_BS(arr1,9);
        System.out.println(ans);

    }
    static  int Order_Agnostic_BS(int[] arr ,int target){
        if (arr.length==0){
            return -1;
        }
        boolean isAsc= arr[0]<arr[arr.length-1];

        int s=0;
        int e=arr.length-1;

        while (s<=e) {

            int mid =  s+(e-s)/2;

            if (arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if (arr[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            else{
                if (arr[mid]>target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;

    }
}
