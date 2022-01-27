import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {21,125,3,566,1,875,28,66,42,245,2,45,96,78,6655,77};
//        int[] ans = sort(arr);
//        System.out.println(Arrays.toString(ans));
        sortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int m=arr.length/2;
        int[] left= sort(Arrays.copyOfRange(arr,0,m));
        int[] right=sort(Arrays.copyOfRange(arr,m,arr.length));

        int[] ans = merge(left,right);
        return ans;
    }
    static int[] merge(int[] l, int[] r){
        int[] ans=new int[l.length+r.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<l.length && j<r.length){
            if (l[i]<=r[j]){
                ans[k]=l[i];
                i++;
                k++;
            }
            else{
                ans[k]=r[j];
                j++;
                k++;
            }
        }
        if (i!=l.length) {
            while (i < l.length) {
                ans[k] = l[i];
                i++;
                k++;
            }
        }
        if (j!=r.length){
            while (j<r.length){
                ans[k]=r[j];
                j++;
                k++;
            }
        }
        return ans;
    }

//    MergeSort In Place
    static void sortInPlace(int[] arr, int s, int e){
        if (e-s==1){
            return;
        }
        int m=(e+s)/2;

        sortInPlace(arr,s,m);
        sortInPlace(arr,m,e);

        mergeInPlace(arr,s,m,e);
    }
    static void  mergeInPlace(int[] arr,int s,int m,int e){
        int[] ans=new int[e-s];

        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e){
            if(arr[i]<=arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length; l++) {
            arr[s+l]=ans[l];
        }
    }
}
