public class SplitArrays {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int ans= splitArrays(arr,2);
        System.out.println(ans);

    }
    static int splitArrays(int [] arr, int m){
        int s=0;
        int e=0;
        for (int num : arr){
            s=Math.max(num,s);
            e+=num;
        }
        while (s<e){
            int mid=s+(e-s)/2;

            int sum=0;
            int pieces=1;
            for (int nums : arr){
                sum+=nums;
                if (sum>mid){
                    sum=nums;
                    pieces++;
                }
            }
            if (pieces>m){
                s=mid+1;
            }
            else{
                e=mid;
            }

        }
        return s;
    }
}
