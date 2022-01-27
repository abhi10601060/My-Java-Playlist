import java.util.Arrays;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int ans=FindInMountain(arr,3);
        System.out.println(ans);
    }

    static int FindInMountain(int[] arr , int target){
        int p=getPivot(arr);
        int f=BinarySearch(arr,target,0,p);


        if (f==-1){
            int s=BinarySearch(arr,target,p+1,arr.length-1);;
            return s;
        }
        else{
            return f;
        }


    }
    static int getPivot(int[]arr){
        int s = 0;
        int e= arr.length-1;

        while(s<e){
            int mid=s+(e-s)/2;

            if (arr[mid]>arr[mid+1]){
                e=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
        }
        return s;
    }
     static int BinarySearch(int[] arr,int target, int start, int end) {
         int s = start;
         int e = end;

         boolean isAsc = arr[start] < arr[end];

         while (s <= e) {
             int mid = s + (e - s) / 2;

             if (arr[mid] == target) {
                 return mid;
             }
             if (isAsc) {
                 if (target > arr[mid]) {
                     s = mid + 1;
                 } else {
                     e = mid - 1;
                 }

             } else {
                 if (target < arr[mid]) {
                     s = mid + 1;
                 } else {
                     e = mid - 1;

                 }

             }

         }
         return -1;
     }
}
