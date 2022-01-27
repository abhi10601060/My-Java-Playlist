package Lec5.Interfaces;

public interface Engine {
    static final int PRICE=70000;    // in Interfaces all the methods are abstract and variables are static and final by default

    void start();
    void stop();
    void acc();

    public static void greet(){
        System.out.println("hi");
    }

}
