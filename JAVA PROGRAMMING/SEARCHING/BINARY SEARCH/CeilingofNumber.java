public class CeilingofNumber {
    public static void main(String[] args) {

        int[] arr={1,5,8,10,12,18,89,899};
        int ceil=Ceiling(arr,0);
        int floor= Floor(arr,8);
        System.out.println(ceil);
        System.out.println(floor);

    }
    static int  Ceiling(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                return arr[mid];
            }
            else if (target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if (s==arr.length){
            return -1;
        }
        return arr[s];
    }
    static int Floor(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]==target){
                return arr[mid];
            }
            else if (target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if (e<0){
            return -1;
        }
        return arr[e];
    }
}
