public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(5));

    }
    public static boolean isHappy(int n){
        int slow=n;
        int fast=n;

        do{
            slow=getNumber(slow);
            fast=getNumber(getNumber(fast));
        }while (slow!=fast);

        if(slow==1){
            return true;
        }
        return false;

    }
    private static int getNumber(int n){
        int ans= 0;
        while(n>0){
            ans+=(n%10)*(n%10);
            n=n/10;
        }
        return ans;
    }
}
