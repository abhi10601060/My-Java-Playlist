import java.util.ArrayList;

public class ArrayListInBody {
    public static void main(String[] args) {
        int[] arr={1,2,3,55,66,44,77,77,88,99,77,88,77,7,77,88,97,777,77,7,7};
        System.out.println(findAllIndex(arr,77,0));

    }
    static ArrayList<Integer> findAllIndex(int [] arr,int target,int idx){

        ArrayList<Integer> ans=new ArrayList<>();
        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> pre=findAllIndex(arr,target ,idx+1);
        ans.addAll(pre);
        return ans;
    }
}
