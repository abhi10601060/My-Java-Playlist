public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,45,89,6,5,423,74};
        helper(arr);
        System.out.println(arr);

    }
    static void sort(int[] arr,int p,int i){
        if (p==0){
            return;
        }
        if(i>=p-1){
            sort(arr,p-1,0);
        }
        if (arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        sort(arr,p,i+1);
    }
    static void helper(int[] arr){
        sort(arr,arr.length-1,0);
    }
}
