import java.util.ArrayList;

public class CombinationOfDice {
    public static void main(String[] args) {
        ArrayList<String> ans =diceCombination(6,"");
        System.out.println(ans);

    }
    static ArrayList<String> diceCombination(int n , String p){
        if (n<0){
            return new ArrayList<>() ;
        }
        if (n == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int[] dice ={1,2,3,4,5,6};

        for(int num : dice){
            ans.addAll(diceCombination(n-num,p+Integer.toString(num)));
        }
        return ans;
    }

}
