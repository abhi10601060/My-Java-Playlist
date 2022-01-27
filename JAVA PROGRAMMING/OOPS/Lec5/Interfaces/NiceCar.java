package Lec5.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    NiceCar(){
        this.engine=new ICEngine();
    }
    public void upgrade(){
        this.engine=new ElectricEngine();
    }
    public void startCar(){
        engine.start();
    }
    public void stopCar(){
        engine.stop();
    }
    public void startMedia(){
        player.start();
    }
    public void stopMedia(){
        player.stop();
    }
}
