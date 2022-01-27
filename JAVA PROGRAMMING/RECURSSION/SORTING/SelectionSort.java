import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,45,89,6,5,423,74};
        selection(arr,0,1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr, int i , int j, int min){
        if (i==arr.length){
            return;
        }
        if (j==arr.length){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            selection(arr,i+1,i+2,i+1);
        }
        if (arr[j]<arr[min]){
            selection(arr,i,j+1,j);
        }
    }
}
