import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={-225,8789,56468486,11,2,-456456,321,-84848,54,22,45,3,65665,879,32,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        int n= arr.length-1;
        for (int i = 0; i <n ; i++) {
            int min=i;
            for (int j = i+1; j <=n ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }

            }
            swap(arr,i,min);
        }
    }
    static void swap (int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
