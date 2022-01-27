public class Pattarn {
    public static void main(String[] args) {
//        pattern1(4);
        pattern2(4);

    }
    static void pattern1(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern1(n-1);

    }
    static  void pattern2(int n){
        if(n==0){
            return;
        }
        pattern2(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

}
