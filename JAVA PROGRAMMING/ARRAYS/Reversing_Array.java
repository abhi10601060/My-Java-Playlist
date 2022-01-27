import java.util.Arrays;

public class Reversing_Array {
    public static void main(String[] args) {
        int[]arr= {11,5545,23,6,44654,855};

        int[]ans=reversed(arr);
        System.out.println(Arrays.toString(ans));

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int[] reversed(int[] arr){
        int start=0;
        int end= arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
        return arr;
    }
    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
    }
}
