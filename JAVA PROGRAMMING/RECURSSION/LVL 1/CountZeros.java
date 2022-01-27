public class CountZeros {
    public static void main(String[] args) {
        int ans=countZeros(1030020400);
        System.out.println(ans);

    }
    static int countZeros(int n ){
       return helper(n,0);
    }
    static int helper(int n, int ans){
        if(n<10){
            return ans;
        }
        if (n%10==0){
            ans+=1;
        }
        return helper(n/10,ans);
    }
}
