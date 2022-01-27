package Lec2;

public class Staticblock {  // static block works only for the first object of that class
    static int a=5;
    static int b;
    static {
        System.out.println("initializing Stattic Block");
        b=a*5;
        System.out.println(b);
    }
    public static void main(String[] args) {
        Staticblock a =new Staticblock();
        System.out.println(Staticblock.b);
        Staticblock.b=3;
        Staticblock c = new Staticblock();// here we can see static block initializes for only the first time when class is initialized
        System.out.println(Staticblock.b);
    }
}
