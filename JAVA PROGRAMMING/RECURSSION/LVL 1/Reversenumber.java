public class Reversenumber {
    public static void main(String[] args) {
        int ans=reverse(12356);
        System.out.println(ans);

    }
    static int reverse(int n){
        if (n<10){
            return n;
        }
        int digits=(int)(Math.log10(n));
        return (int)(n%10*Math.pow(10,digits))+reverse(n/10);
    }
}
