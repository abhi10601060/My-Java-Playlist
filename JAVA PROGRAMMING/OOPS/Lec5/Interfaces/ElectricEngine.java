package Lec5.Interfaces;

public class ElectricEngine implements  Engine{

    @Override
    public void start() {
        System.out.println("Starts Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerates Electric Engine");

    }
}
