public class Nto1 {
    public static void main(String[] args){
        printNto1(10);
        System.out.println();
        print1toN(10);

    }
    static void printNto1(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
//        System.out.print(" ");
        printNto1(n-1);
    }
    static void print1toN(int n){
        if (n==0){
            return ;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }
}
