import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        System.out.println(arr[0]);
        String[] ar1={"dsjaik","aijsjd","asdhua"};
        System.out.println(Arrays.toString(ar1));

        int[] nums=new int[5];

        for (int i = 0; i < nums.length ; i++) {
            nums[i]=i;

        }

        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(nums));

        String[] str=new String[5];
        System.out.println(Arrays.toString(str));


        String[] str1 ={"shda","askdka"};
        str1[1]="sjndja";
//        str1[2]="ashbhjacac";
        System.out.println(Arrays.toString(str1));


        Object[] a= { 1,3,5,"afs","gjg"};
        System.out.println(Arrays.toString(a));

        int[] copy = arr;
        System.out.println(Arrays.toString(copy));

    }
}
