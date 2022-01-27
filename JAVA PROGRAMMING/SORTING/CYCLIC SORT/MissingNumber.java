public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        int ans=missingNumber(arr);
        System.out.println(ans);

    }
    static int missingNumber(int [] arr){
        int i=0;
        while (i<arr.length){
            if (arr[i]!=i && arr[i]<arr.length){
                int correct=arr[i];
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j!=arr[j]){
                return j;
            }

        }
        return arr.length;
    }
    static void swap(int[] arr, int f, int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;

    }
}
