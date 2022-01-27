import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();

        boolean ans =isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i < Math.pow(n,0.5) ; i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;

    }
}
