package Lec5.Interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("Brake is applied");

    }

    @Override
    public void start() {
        System.out.println("Engine starts");

    }

    @Override
    public void stop() {
        System.out.println("engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Car is accelerated");

    }
}
