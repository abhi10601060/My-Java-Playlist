import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
//        System.out.println(isArmstrong(370));

        for (int i = 100; i <1000 ; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }


    static boolean isArmstrong(int n){
        int temp=n;
        int ans=0;
        while (temp>0){
//            int a=temp%10;
            ans+=Math.pow(temp%10,3);
            temp=temp/10;
        }
//        if (ans==n){
////            return true;
////        }
////        else{
////            return false;
////        }
        return ans==n;
    }
}
