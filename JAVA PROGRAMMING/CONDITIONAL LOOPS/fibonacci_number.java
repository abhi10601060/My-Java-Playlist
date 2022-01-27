import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();

        int a=0;
        int b=1;

        for (int i = 0; i <n-1 ; i++) {
            int sum = a+b;
            a=b;
            b=sum;
        }
        System.out.println(b);

        }
}
