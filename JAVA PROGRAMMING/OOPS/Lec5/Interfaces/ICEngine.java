package Lec5.Interfaces;

public class ICEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts IC");

    }

    @Override
    public void stop() {
        System.out.println("Stops IC");

    }

    @Override
    public void acc() {
        System.out.println("Accelerates IC");

    }
}
