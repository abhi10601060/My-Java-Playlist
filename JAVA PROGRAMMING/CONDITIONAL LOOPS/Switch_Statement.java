import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();
/*
        in switch statement the arguments must be as sane type of cases
        no duplicate cases
        break must else it continue doing furtur actions in program
        default must be added at end of statement

 */
        switch(fruit){
            case "mango":
                System.out.println("Yellow");
                break;
            case "apple":
                System.out.println("Red");
                break;
            case "grapes":
                System.out.println("green");
                break;
            default:
                System.out.println("enter valid fruit");
        }

    }
}
