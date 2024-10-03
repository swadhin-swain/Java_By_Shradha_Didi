package Oops.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void accl() {
        System.out.println("Electric engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }
}
