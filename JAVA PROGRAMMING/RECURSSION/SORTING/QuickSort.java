import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {21,125,3,566,1,875,28,66,42,245,2,45,96,78,6655,77};
//        sortInPlace(arr,0,arr.length);
        hoaresQuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int p=arr[e-1];
        int i=s-1;
        int j=s;

        while (j<e){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
            j++;
        }
        swap(arr,i+1,e-1);
        sortInPlace(arr,s,i+1);
        sortInPlace(arr,i+1,e);
    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }

//    using hoares method and taking mid element as pivot

    static void hoaresQuickSort(int[] arr, int s,int e){
        if (e-s==0){
            return;
        }
        int p = (e+s)/2;

        int i =s;
        int j=e;
        while(i<=j){
            while (arr[i]<arr[p]){
                i++;
            }
            while(arr[j]>arr[p]){
                j--;
            }
            if (i <= j) {
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        hoaresQuickSort(arr,s,p);
        hoaresQuickSort(arr,p+1,e);

    }
}
