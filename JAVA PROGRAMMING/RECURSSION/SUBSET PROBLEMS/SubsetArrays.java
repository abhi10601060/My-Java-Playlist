import java.util.ArrayList;

import java.util.List;

public class SubsetArrays {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        List<List<Integer>> ans = iterativeSubsetArray(arr);
        System.out.println(ans);

//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }

    }
    static List<List<Integer>> iterativeSubsetArray(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int nums : arr){
            int n=outer.size();
            for (int i=0;i<n;i++){
                List<Integer> internal =new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
