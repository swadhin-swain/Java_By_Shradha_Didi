package Oops.interfaces;

public class Main {
    public static void main(String[] args) {
    //    Engine  car = new Car();

    //     car.start();;
    //     car.accl();;
    //     car.stop();
    //     //car.brake();

    //     Media carMedia = new Car();
    //     carMedia.stop();

    NiceCar car = new NiceCar();
    car.start();
    car.startMusic();
    car.upgradeEngine();
    car.start();
    }
}
