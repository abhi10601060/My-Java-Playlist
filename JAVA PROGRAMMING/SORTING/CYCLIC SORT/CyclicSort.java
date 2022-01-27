import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={5,3,2,6,4,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                swap(arr,i,correct);

            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
