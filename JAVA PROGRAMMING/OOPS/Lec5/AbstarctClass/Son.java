package Lec5.AbstarctClass;

public class Son extends Parent{

    Son (int age){
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to be coder");
    }

    @Override
    void partner() {
        System.out.println("I love xyz");

    }
}
