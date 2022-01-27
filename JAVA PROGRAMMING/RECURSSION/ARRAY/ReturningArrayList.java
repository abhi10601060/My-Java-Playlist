import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,88,6,2,1,88,6,88,5,88,6,45,88,8,888,8,8,45,88};
        System.out.println(findAllPosn(arr,88,0,new ArrayList<>()));
    }
    static ArrayList<Integer> findAllPosn(int[] arr,int target,int idx,ArrayList<Integer> ans){
        if (idx==arr.length){
            return ans;
        }
        if (arr[idx]==target){
            ans.add(idx);
        }
        return findAllPosn(arr,target,idx+1,ans);
    }
}
