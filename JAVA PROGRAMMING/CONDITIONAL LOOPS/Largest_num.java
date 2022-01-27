import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int a= input.nextInt();
        int b = input.nextInt();
        int c =input.nextInt();

        int Largest;

        if (a>b){
            Largest=a;
        }
        else{
            Largest=b;

        }
        if (c>Largest){
            Largest=c;

        }
//        else{
//            System.out.println(Largest);
//        }
        System.out.print("Largest Number Is : ");
        System.out.println(Largest);
    }



}
