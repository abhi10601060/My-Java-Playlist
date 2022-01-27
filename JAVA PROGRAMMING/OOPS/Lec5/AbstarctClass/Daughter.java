package Lec5.AbstarctClass;

public class Daughter extends Parent{
    Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to be doctor");
    }

    @Override
    void partner() {
        System.out.print("I love Thor");
    }
}
