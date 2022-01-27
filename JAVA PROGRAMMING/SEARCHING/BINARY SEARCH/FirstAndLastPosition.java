public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {

        int s =0;
        int e= nums.length-1;
        int[] ans=new int[2];


        while (s<=e) {
            int mid =  s+(e-s)/2;

            if (nums[mid]==target){
                 int temp1=mid;
                 while (temp1>=0 && nums[temp1]==target){
                     temp1-=1;
                 }
                 ans[0]=temp1+1;
                 int temp2=mid;
                 while(temp2<=nums.length-1 && nums[temp2]==target){
                     temp2+=1;
                 }
                 ans[1]=temp2-1;

                 return ans;
            }
            else if (nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return new int[] {-1,-1};

    }
}
