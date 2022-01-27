import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int[] b= {1,2,3,4,5,6};
//        b[1]=89;
        System.out.println(Arrays.equals(a,b));
//        System.out.println(Arrays.toString(a));
        String a1=new String ("abhi");
        String b1=new String ("abhi");
        System.out.println(a1.equals(b1));
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(45);
        System.out.println(a1.charAt(0));
        arr.add(89);
        System.out.println(a1+arr);
        System.out.println(PalindromeString("abcba"));
    }
    static boolean PalindromeString(String str){
        int n=str.length();

        if (str.length()%2==0){
            for (int i = 0; i < n/2 ; i++) {
                if (str.charAt(i)!=str.charAt(n-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
