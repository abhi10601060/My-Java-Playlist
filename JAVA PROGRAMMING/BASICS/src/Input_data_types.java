import java.util.Scanner;

public class Input_data_types {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int num= input.nextInt();
        System.out.println("your num is : "+ num);

        String str = input.next();
        System.out.println("your string is : " + str);

        float F = input.nextFloat();
        System.out.println("your Float is : "+ F);
    }
}
