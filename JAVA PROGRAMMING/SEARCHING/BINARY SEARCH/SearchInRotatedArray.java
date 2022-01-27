import com.sun.jdi.connect.Connector;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={3,5,1};
//        System.out.println(getPPivot(arr));
        int ans = search(arr,3);
        System.out.println(ans);


    }
    static int search(int[] nums, int target) {
        boolean isAsc=nums[0]<nums[nums.length-1];
        if(isAsc){
            int ans=BinarySearch(nums,target,0,nums.length-1);
            return ans;
        }
        int p= getPPivot(nums);

        if(target==nums[p]){
            return p;
        }

        if (target>=nums[0]){
            return BinarySearch(nums,target,0,p);
        }
        return  BinarySearch(nums,target,p+1,nums.length-1);


    }
    static int getPPivot(int[] arr){
        int s=0;
        int e= arr.length-1;

        while (s<e){
            int mid = s+(e-s)/2;

            if (arr[mid]>=arr[0] && arr[mid+1]<arr[mid]){
                return mid;
            }
            else if (arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
    static  int BinarySearch(int[] arr,int target,int start, int end){
        int s =start;
        int e= end;


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
