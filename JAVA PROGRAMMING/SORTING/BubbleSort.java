import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr ={5,878,21,366,4,522,59,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){       //also known as Syncing Sort or Exchange Sort.....
        int n = arr.length-1;
        for (int i = 0; i < n; i++) {
            boolean swapped=false;
            for (int j = 0; j < n-i; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if (swapped==false){
                return;
            }
        }

    }
    static void swap (int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
