import java.util.Scanner;

public class is_lowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a=in.next();
        char ch = a.trim().charAt(0);

        if (ch>='a' && ch <= 'z' ){
            System.out.println("is Lower Case !!");
        }
        else{
            System.out.println("not");
        }

    }
}
