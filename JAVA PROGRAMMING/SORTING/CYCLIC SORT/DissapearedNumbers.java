import java.util.ArrayList;
import java.util.List;

public class DissapearedNumbers {
    public static void main(String[] args) {

    }
    static List<Integer> find(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }

            else {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;

    }


    static void swap(int [] arr, int f, int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    
}
