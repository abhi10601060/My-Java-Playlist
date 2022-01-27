package Lec5.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starts CD Player");
    }

    @Override
    public void stop() {
        System.out.println("Stops CD Player");

    }
}
