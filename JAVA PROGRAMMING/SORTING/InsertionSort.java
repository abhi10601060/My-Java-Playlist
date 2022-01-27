import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={-225,8789,56468486,11,2,-456456,321,-84848,54,22,45,3,65665,879,32,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int []arr){
            int n=arr.length-1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }

            }

        }
    }
}
