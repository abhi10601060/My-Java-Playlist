public class RoatatedDuplicateArray {
    public static void main(String[] args) {
        int[] arr={2,5,6,0,0,1,2};
        int ans=RotatedDuplicateBS(arr,0);
        System.out.println(ans);


    }
    static int RotatedDuplicateBS(int[] arr , int target){
        int s=0;
        int e=arr.length-1;
        if(target==arr[0]){
            return 0;
        }
        while (s<e && arr[s]==arr[e]){
            s+=1;
            e-=1;
        }

        int p = getPivot(arr,s,e);

        if (target>=arr[s]){
            int ans=BinarySearch(arr,target,s, p );
            return ans;
        }
        else{
            int ans=BinarySearch(arr,target,p+1,e);
            return ans;
        }

    }
    static int getPivot(int [] arr,int start,int end){
        int s=start;
        int e=end;

        while (s<e){
            int mid=s+(e-s)/2;
            if (arr[mid]>=arr[start] && arr[mid+1]<arr[mid]){
                return mid;
            }
            else if(arr[mid]>=arr[start]){
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
