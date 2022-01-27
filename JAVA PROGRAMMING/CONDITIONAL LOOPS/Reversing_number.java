import java.util.Scanner;

public class Reversing_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write Your Number : ");
        int Num= input.nextInt();

        int ans=0;
        while (Num>0){
            int rem=Num%10;
            ans=ans*10+rem;
            Num=Num/10;
        }
        System.out.print("Reversed Number Is : ");
        System.out.println(ans);
    }
}

